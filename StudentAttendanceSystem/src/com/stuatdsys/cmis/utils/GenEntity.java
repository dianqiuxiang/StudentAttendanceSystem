package com.stuatdsys.cmis.utils;

import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.PrintWriter;  
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;  
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;  

/**
 * ����ʵ�幤����
 * ��д������ȫ�ֱ���tablename��,�������ɸñ��ʵ����
 * Ҳ����һ��������ȫ��ʵ����
 */ 

public class GenEntity {  
      
    private boolean f_util = false; // �Ƿ���Ҫ�����java.util.*  
    private boolean f_sql = false; // �Ƿ���Ҫ�����java.sql.* 

    
    /** 
     * ��ȡ����ע�ͣ��Ȼ��ĳ��Ľ�����䣬�ٴӽ�������У���ȡ����ע�� 
     * @param driver ���ݿ��������� 
     * @param url ���ݿ�����url 
     * @param user  ���ݿ��½�û��� 
     * @param pwd ���ݿ��½���� 
     * @param tableName ���� 
     * @return comment 
     * @return 
     * @throws Exception 
     */  
    public String getCommentByTableName(String driver,String url,String user,String pwd,String tableName) throws Exception {  
        
    	String comment = "";  
        Connection conn = getConnections(driver,url,user,pwd);  
        Statement stmt = conn.createStatement();  
        ResultSet rs = stmt.executeQuery("SHOW CREATE TABLE " + tableName);  
        if (rs != null && rs.next()) {  
            String createDDL = rs.getString(2);  
            
           
            int index = createDDL.indexOf("COMMENT='");  
            if (index < 0) {  
                return "";  
            }  
            comment = createDDL.substring(index + 9);  
            comment = comment.substring(0, comment.length() - 1);  
            
        }  
        rs.close();
        stmt.close();  
        conn.close();  
        return comment;  
    } 
    
    /** 
     * �������ݿ�����Ӳ�������ȡָ����Ļ�����Ϣ���ֶ������ֶ����͡��ֶ�ע�� 
     * @param driver ���ݿ��������� 
     * @param url ���ݿ�����url 
     * @param user  ���ݿ��½�û��� 
     * @param pwd ���ݿ��½���� 
     * @param tableName ���� 
     * @return Map���� 
     */  
    public List<Map> getTableInfo(String driver,String url,String user,String pwd,String tableName){  
        List<Map> result = new ArrayList();  
          
        Connection conn = null;       
        DatabaseMetaData dbmd = null;  
          
        try {  
            conn = getConnections(driver,url,user,pwd);  
              
            dbmd = conn.getMetaData();  
            ResultSet resultSet = dbmd.getTables(null, "%", tableName, new String[] { "TABLE" });  
              
            while (resultSet.next()) {  
                String table_Name=resultSet.getString("TABLE_NAME"); 
                  
                if(table_Name.equals(tableName)){  
                    ResultSet rs = conn.getMetaData().getColumns(null, getSchema(conn),tableName.toUpperCase(), "%");  
  
                    while(rs.next()){  
                        //System.out.println("�ֶ�����"+rs.getString("COLUMN_NAME")+"--�ֶ�ע�ͣ�"+rs.getString("REMARKS")+"--�ֶ��������ͣ�"+rs.getString("TYPE_NAME"));  
                        Map map = new HashMap();  
                        String colName = rs.getString("COLUMN_NAME");  
                        map.put("code", colName);  
                          
                        String remarks = rs.getString("REMARKS");  
                        if(remarks == null || remarks.equals("")){  
                            remarks = colName;  
                        }  
                        map.put("comment",remarks);  
                          
                        String dbType = rs.getString("TYPE_NAME");  
                        map.put("dbType",dbType);
                        
                        if(dbType.toUpperCase().equalsIgnoreCase("DATETIME")||dbType.toUpperCase().equalsIgnoreCase("DATE")||dbType.toUpperCase().equalsIgnoreCase("TIMESTAMP")){  
                            f_util = true;  
                        }  
                        if(dbType.toUpperCase().equalsIgnoreCase("IMAGE") || dbType.toUpperCase().equalsIgnoreCase("TEXT")){  
                            f_sql = true;  
                        }  
                          
                        map.put("valueType", sqlType2JavaType(dbType));  
                        result.add(map);  
                    }  
                }  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally{  
            try {  
                conn.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
          
        return result;  
    }  
      
    
  
    //��ȡ����  
    private static Connection getConnections(String driver,String url,String user,String pwd) throws Exception {  
        Connection conn = null;  
        try {  
            Properties props = new Properties();  
            props.put("remarksReporting", "true");  
            props.put("user", user);  
            props.put("password", pwd);  
            Class.forName(driver);  
            conn = DriverManager.getConnection(url, props);  
        } catch (Exception e) {  
            e.printStackTrace();  
            throw e;  
        }  
        return conn;  
    }  
      
    //�������ݿⲻ��Ҫ�������, oracle��db2��Ҫ  
    private static String getSchema(Connection conn) throws Exception {  
        String schema;  
        schema = conn.getMetaData().getUserName();  
        if ((schema == null) || (schema.length() == 0)) {  
            throw new Exception("ORACLE���ݿ�ģʽ������Ϊ��");  
        }  
        return schema.toUpperCase().toString();  
  
    }  
    
    public void genEntity(String driver,String url,String user,String pwd,String tablename,String packageOutPath)
    {
    	String tableComment="";//��ȡ����ע��
		try {
			tableComment = getCommentByTableName(driver,url,user,pwd,tablename);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	List<Map> list = getTableInfo(driver,url,user,pwd,tablename);//��ȡ��ṹ��Ϣ
    	
    	String content=parse(tablename,tableComment,list,packageOutPath);
    	
    	try {  
            File directory = new File("");  
            //System.out.println("����·����"+directory.getAbsolutePath());  
            //System.out.println("���·����"+directory.getCanonicalPath());  
            String path=this.getClass().getResource("").getPath();  
              
            System.out.println(path);  
            System.out.println("src/?/"+path.substring(path.lastIndexOf("/com/", path.length())) );  
//          String outputPath = directory.getAbsolutePath()+ "/src/"+path.substring(path.lastIndexOf("/com/", path.length()), path.length()) + initcap(tablename) + ".java";  
            String outputPath = directory.getAbsolutePath()+ "/src/"+packageOutPath.replace(".", "/")+"/"+initcap(tablename) + ".java";  
            FileWriter fw = new FileWriter(outputPath);  
            PrintWriter pw = new PrintWriter(fw);  
            pw.println(content);  
            pw.flush();  
            pw.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
     
   
    
    /** 
     * ���ܣ�����ʵ����������� 
     * @param colnames 
     * @param colTypes 
     * @param colSizes 
     * @param tablename 
     * @return 
     */
    private String parse(String tablename,String tableComment,List<Map> list,String packageOutPath)
    {
    	StringBuffer sb = new StringBuffer();  
        
        //�ж��Ƿ��빤�߰�  
        if(f_util){  
            sb.append("import java.util.Date;\r\n");  
        }  
        if(f_sql){  
            sb.append("import java.sql.*;\r\n");  
        }  
        sb.append("package " + packageOutPath + ";\r\n");  
        sb.append("\r\n");  
        //ע�Ͳ���
        sb.append("   /**\r\n");  
        sb.append("    * "+tablename+"\t"+tableComment+"\r\n");  
        sb.append("    * "+new Date()+"\r\n");  
        sb.append("    */ \r\n");  
        //ʵ�岿��  
        sb.append("\r\n\r\npublic class " + initcap(tablename) + " {\r\n");  
        
        for (Map map : list) {  //����
        	
        	String code=map.get("code").toString();
        	String valueType=map.get("valueType").toString();
        	String comment=map.get("comment").toString();
        	
            sb.append("\tprivate " + valueType + " " + code + ";\t//"+comment+"\r\n");  
        } 
        
        sb.append("\t\r\n");  
        for (Map map : list) {  //�������з��� ( get set����  )
        	
        	String code=map.get("code").toString();
        	String valueType=map.get("valueType").toString();
        	String comment=map.get("comment").toString();
        	
            sb.append("\tpublic void set" + initcap(code) + "(" + valueType + " " +   
            		code + "){\r\n");  
            sb.append("\t\tthis." + code + "=" + code + ";\r\n");  
            sb.append("\t}\r\n");  
            sb.append("\tpublic " + valueType + " get" + initcap(code) + "(){\r\n");  
            sb.append("\t\treturn " + code + ";\r\n");  
            sb.append("\t}\r\n\r\n");  
        }  
        
        sb.append("}\r\n");  
          
        //System.out.println(sb.toString());  
        return sb.toString();  
    }
    
    /** 
     * ���ܣ��������ַ���������ĸ�ĳɴ�д 
     * @param str 
     * @return 
     */  
    private String initcap(String str) {  
          
        char[] ch = str.toCharArray();  
        if(ch[0] >= 'a' && ch[0] <= 'z'){  
            ch[0] = (char)(ch[0] - 32);  
        }  
          
        return new String(ch);  
    }  
  
    /** 
     * ���ܣ�����е��������� 
     * @param sqlType 
     * @return 
     */  
    private String sqlType2JavaType(String sqlType) {  
          
        if(sqlType.equalsIgnoreCase("bit")){  
            return "Boolean";  
        }else if(sqlType.equalsIgnoreCase("tinyint")){  
            return "Byte";  
        }else if(sqlType.equalsIgnoreCase("smallint")){  
            return "Short";  
        }else if(sqlType.equalsIgnoreCase("int")){  
            return "Integer";  
        }else if(sqlType.equalsIgnoreCase("bigint")){  
            return "Long";  
        }else if(sqlType.equalsIgnoreCase("float")){  
            return "Float";  
        }else if(sqlType.equalsIgnoreCase("decimal") || sqlType.equalsIgnoreCase("numeric")   
                || sqlType.equalsIgnoreCase("real") || sqlType.equalsIgnoreCase("money")   
                || sqlType.equalsIgnoreCase("smallmoney")){  
            return "Double";  
        }else if(sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char")   
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar")   
                || sqlType.equalsIgnoreCase("text")){  
            return "String";  
        }else if(sqlType.equalsIgnoreCase("datetime")||sqlType.equalsIgnoreCase("date")){  
            return "Date";  
        }else if(sqlType.equalsIgnoreCase("image")){  
            return "Blob";  
        }  
          
        return null;  
    }  
     
    
    /**
     * ��ȡ���еı���
     * @param driver
     * @param url
     * @param user
     * @param pwd
     * @return
     */
    public Set<String> getAllTableName(String driver,String url,String user,String pwd) {
    	
    	Connection conn=null;
    	Set<String> set = new HashSet<String>();
    	try {
    		conn = getConnections(driver,url,user,pwd);
			DatabaseMetaData meta = conn.getMetaData();
            ResultSet rs = meta.getTables(null, null, null,
                    new String[] { "TABLE" });
            while (rs.next()) {
                set.add(rs.getString(3));
            }
    	} catch (SQLException e) {  
            e.printStackTrace();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally{  
            try {  
            	conn.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
        
        
        return set;
    }
    /** 
     * main����
     * TODO 
     * @param args 
     */  
    public static void main(String[] args) {  
          
    	//������Oracle���ӷ���  
        
//      String driver = "oracle.jdbc.driver.OracleDriver";  
//      String url = "jdbc:oracle:thin:@192.168.12.44:1521:orcl";  
//      String user = "bdc";  
//      String pwd = "bdc123";  
//      //String table = "FZ_USER_T";  
//      String table = "FZ_USER_T";  
        
      //mysql  
      
      String driver = "com.mysql.jdbc.Driver"; 
      String user = "root"; 
      String pwd = "123456"; 
      String url = "jdbc:mysql://localhost/cmis" 
              + "?useUnicode=true&characterEncoding=UTF-8"; 
      String packageOutPath = "com.cmis.tab.model";//ָ��ʵ���������ڰ���·�� 
      String tableName = "tbl_user"; 
      
      GenEntity gen=new GenEntity();
      
      //���ձ������ɶ�Ӧ��ʵ����
//      gen.genEntity(driver,url,user,pwd,tableName,packageOutPath);  
        
      //һ������������ʵ����
      Set<String> allTableName=gen.getAllTableName(driver,url,user,pwd); //��ȡ���еı���
      for(String tblName:allTableName)
      {
    	  gen.genEntity(driver,url,user,pwd,tblName,packageOutPath); 
      }
    }  
  
}  