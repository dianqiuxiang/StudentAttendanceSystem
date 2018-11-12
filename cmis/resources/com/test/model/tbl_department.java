package com.test.model;

public class tbl_department {
    /**
     *主键
     */
    private Integer id;

    /**
     *系号
     */
    private String department_No;

    /**
     *系名
     */
    private String department_Name;

    /**
     *记录创建时间
     */
    private String create_Time;

    /**
     *记录修改时间
     */
    private String update_Time;

    /**
     *主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *系号
     */
    public String getDepartment_No() {
        return department_No;
    }

    /**
     *系号
     */
    public void setDepartment_No(String department_No) {
        this.department_No = department_No == null ? null : department_No.trim();
    }

    /**
     *系名
     */
    public String getDepartment_Name() {
        return department_Name;
    }

    /**
     *系名
     */
    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name == null ? null : department_Name.trim();
    }

    /**
     *记录创建时间
     */
    public String getCreate_Time() {
        return create_Time;
    }

    /**
     *记录创建时间
     */
    public void setCreate_Time(String create_Time) {
        this.create_Time = create_Time == null ? null : create_Time.trim();
    }

    /**
     *记录修改时间
     */
    public String getUpdate_Time() {
        return update_Time;
    }

    /**
     *记录修改时间
     */
    public void setUpdate_Time(String update_Time) {
        this.update_Time = update_Time == null ? null : update_Time.trim();
    }
}