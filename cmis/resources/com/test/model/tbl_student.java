package com.test.model;

public class tbl_student {
    /**
     *主键
     */
    private Integer id;

    /**
     *学号
     */
    private String stu_No;

    /**
     *姓名
     */
    private String stu_Name;

    /**
     *班级编号
     */
    private Integer class_Id;

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
     *学号
     */
    public String getStu_No() {
        return stu_No;
    }

    /**
     *学号
     */
    public void setStu_No(String stu_No) {
        this.stu_No = stu_No == null ? null : stu_No.trim();
    }

    /**
     *姓名
     */
    public String getStu_Name() {
        return stu_Name;
    }

    /**
     *姓名
     */
    public void setStu_Name(String stu_Name) {
        this.stu_Name = stu_Name == null ? null : stu_Name.trim();
    }

    /**
     *班级编号
     */
    public Integer getClass_Id() {
        return class_Id;
    }

    /**
     *班级编号
     */
    public void setClass_Id(Integer class_Id) {
        this.class_Id = class_Id;
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