package com.stuatdsys.cmis.utils;

import java.util.Map;  

public class PageEntity {  
    private Integer page; //Ŀǰ�ǵڼ�ҳ  
    private Integer size; //ÿҳ��С  
    private Map params; //����Ĳ���  
    private String orderColumn;  
    private String orderTurn = "ASC";  
      
    public String getOrderColumn() {  
        return orderColumn;  
    }  
    public void setOrderColumn(String orderColumn) {  
        this.orderColumn = orderColumn;  
    }  
    public String getOrderTurn() {  
        return orderTurn;  
    }  
    public void setOrderTurn(String orderTurn) {  
        this.orderTurn = orderTurn;  
    }  
    public Integer getPage() {  
        return page;  
    }  
    public void setPage(Integer page) {  
        this.page = page;  
    }  
    public Integer getSize() {  
        return size;  
    }  
    public void setSize(Integer size) {  
        this.size = size;  
    }  
    public Map getParams() {  
        return params;  
    }  
    public void setParams(Map params) {  
        this.params = params;  
    }  
}  
