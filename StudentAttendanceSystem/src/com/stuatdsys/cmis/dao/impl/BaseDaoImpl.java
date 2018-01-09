package com.stuatdsys.cmis.dao.impl;

  
import java.io.Serializable;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  
import javax.annotation.Resource;  
  
import org.apache.ibatis.mapping.BoundSql;  
import org.apache.ibatis.mapping.MappedStatement;  
import org.apache.ibatis.session.Configuration;  
import org.apache.ibatis.session.RowBounds;  
import org.mybatis.spring.SqlSessionTemplate;  
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.utils.PageEntity;
import com.stuatdsys.cmis.utils.PagingResult;  
  
/** 
 * baseDAO��ʵ�ֻ��� 
 *  
 * @author hwt 
 *  
 * @param <T>
 */  
public class BaseDaoImpl<T> extends  
        SqlSessionDaoSupport implements BaseDao<T> {  
    // mapper.xml�е�namespace  
    private String namespace;  
    
//    @Resource(name = "sqlSessionTemplate")
//    private SqlSessionTemplate sqlSessionTemplate;
  
    // sqlmap.xml�����ļ��ж�Ӧ��sqlid  
    public static final String SQLID_INSERT = "insert";  
    public static final String SQLID_INSERT_BATCH = "insertBatch";  
    public static final String SQLID_UPDATE = "update";  
    public static final String SQLID_UPDATE_PARAM = "updateParam";  
    public static final String SQLID_UPDATE_BATCH = "updateBatch";  
    public static final String SQLID_DELETE = "delete";  
    public static final String SQLID_DELETE_PARAM = "deleteParam";  
    public static final String SQLID_DELETE_BATCH = "deleteBatch";  
    public static final String SQLID_TRUNCATE = "truncate";  
    public static final String SQLID_SELECT = "select";  
    public static final String SQLID_SELECT_PK = "selectPk";  
    public static final String SQLID_SELECT_PARAM = "selectParam";  
    public static final String SQLID_SELECT_FK = "selectFk";  
    public static final String SQLID_COUNT = "count";  
    public static final String SQLID_COUNT_PARAM = "countParam";  
  
    @Resource(name = "sqlSessionTemplate")  
    public void setSuperSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {  
        super.setSqlSessionTemplate(sqlSessionTemplate);  
    }  
  
    public String getNamespace() {  
        return namespace;  
    }  
  
    public void setNamespace(String namespace) {  
        this.namespace = namespace;  
    }  
  
    @Override  
    public int insert(T entity) {  
        int rows = 0;  
        try {  
            rows = this.getSqlSession().insert(namespace + "." + SQLID_INSERT,  
                    entity);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return rows;  
    }  
  
    @Override  
    public int update(T entity) {  
        int rows = 0;  
        try {  
            rows = this.getSqlSession().update(namespace + "." + SQLID_UPDATE,  
                    entity);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return rows;  
    }  
  
    @Override  
    public int updateParam(Map param) {  
        int rows = 0;  
        try {  
            rows = this.getSqlSession().update(namespace + "." + SQLID_UPDATE_PARAM,  
                    param);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return rows;  
    }  
  
    @Override  
    public int delete(int primaryKey) {  
        int rows = 0;  
        try {  
            rows = this.getSqlSession().delete(namespace + "." + SQLID_DELETE,  
                    primaryKey);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return rows;  
    }  
  
    @Override  
    public int deleteParam(Map param) {  
        int rows = 0;  
        try {  
            rows = this.getSqlSession().delete(namespace + "." + SQLID_DELETE_PARAM,  
                    param);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return rows;  
    }  
  
    @Override  
    public int truncate() {  
        int rows = 0;  
        try {  
            rows = this.getSqlSession().delete(namespace + "." + SQLID_TRUNCATE);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return rows;  
    }  
  
    @Override  
    public int count() {  
        int result = 0;  
        try {  
            result = this.getSqlSession().selectOne(namespace + "." + SQLID_COUNT);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return result;  
    }  
  
    @Override  
    public int count(Object param) {  
        int result = 0;  
        try {  
            result = this.getSqlSession().selectOne(namespace + "." + SQLID_COUNT_PARAM,param);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return result;  
    }  
  
    @Override  
    public T get(int primaryKey) {  
        try {  
            return this.getSqlSession().selectOne(namespace + "." + SQLID_SELECT_PK,primaryKey);  
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
  
    @Override  
    public List<T> select() {  
        try {  
            return this.getSqlSession().selectList(namespace + "." + SQLID_SELECT);  
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
          
    }  
  
    @Override  
    public List<T> selectParam(Map param) {  
        try {  
            return this.getSqlSession().selectList(namespace + "." + SQLID_SELECT_PARAM,param);  
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
  
    @Override  
    public PagingResult<T> selectPagination(PageEntity pageEntity) {  
        try {  
            int page = pageEntity.getPage() == null || "".equals(pageEntity.getPage()) ? 1 : pageEntity.getPage(); //Ĭ��Ϊ��һҳ  
            int size = pageEntity.getSize() == null || "".equals(pageEntity.getSize()) ? 15 : pageEntity.getSize();; //Ĭ��ÿҳ15��  
              
            RowBounds rowBounds = new RowBounds((page-1)*size, size);  
              
            Map param = pageEntity.getParams();  
            if (param != null) {  
                param.put("orderColumn", pageEntity.getOrderColumn());  
                param.put("orderTurn", pageEntity.getOrderTurn());  
            }else {  
                param = new HashMap();  
                param.put("orderColumn", pageEntity.getOrderColumn());  
                param.put("orderTurn", pageEntity.getOrderTurn());  
            }  
              
            List<T> resultList = this.getSqlSession().selectList(namespace + "." + SQLID_SELECT_PARAM,param,rowBounds);  
            int totalSize = count(pageEntity.getParams());  
              
            PagingResult<T> pagingResult = new PagingResult<T>();  
            pagingResult.setCurrentPage(page);  
            pagingResult.setTotalSize(totalSize);  
            pagingResult.setResultList(resultList);  
            return pagingResult;  
              
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
  
  
    @Override  
    public int insertBatch(List<T> list) {  
        try {  
            return this.getSqlSession().insert(namespace + "." + SQLID_INSERT_BATCH,list);  
        } catch (Exception e) {  
            e.printStackTrace();  
            return 0;  
        }  
    }  
   
    @Override  
    public int updateBatch(List<T> list) {  
        int rows = 0;  
        try {  
            for (T t : list) {  
                rows = rows + this.getSqlSession().update(namespace + "." + SQLID_UPDATE, t);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return rows;  
  
    }  
  
    @Override  
    public int deleteBatch(List<Integer> list) {  
        try {  
            return this.getSqlSession().delete(namespace + "." + SQLID_DELETE_BATCH,list);  
        } catch (Exception e) {  
            e.printStackTrace();  
            return 0;  
        }  
  
    }  
      
    /** 
     * ��־��ӡ 
     * @param sqlId 
     * @param param 
     */  
    public void printLog(String sqlId,Object param){  
        Configuration configuration = this.getSqlSession().getConfiguration();  
        //sqlIdΪ�����ļ��е�sqlid  
        MappedStatement mappedStatement = configuration.getMappedStatement(sqlId);  
        //paramΪ���뵽sql����еĲ���  
        BoundSql boundSql = mappedStatement.getBoundSql(param);  
        //�õ�sql���  
        String sql = boundSql.getSql().trim();  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println("info-sql: "+sdf.format(new Date())+"  "+sql);  
    }  
}   