package com.stuatdsys.cmis.utils;

import java.util.ArrayList;  
import java.util.List;  
  
/** 
 * ��ҳ��� 
 * @author hwt 
 * 
 */  
public class PagingResult<T> {  
    //��ǰҳ  
    private int currentPage;  
    //�ܹ���¼����  
    private int totalSize;  
    //�����  
    private List<T> resultList = new ArrayList<T>();  
      
      
    public int getCurrentPage() {  
        return currentPage;  
    }  
    public void setCurrentPage(int currentPage) {  
        this.currentPage = currentPage;  
    }  
    public int getTotalSize() {  
        return totalSize;  
    }  
    public void setTotalSize(int totalSize) {  
        this.totalSize = totalSize;  
    }  
    public List<T> getResultList() {  
        return resultList;  
    }  
    public void setResultList(List<T> resultList) {  
        this.resultList = resultList;  
    }  
}  