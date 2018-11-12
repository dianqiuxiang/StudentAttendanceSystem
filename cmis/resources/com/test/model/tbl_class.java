package com.test.model;

public class tbl_class {
    /**
     *主键
     */
    private Integer id;

    /**
     *班级号
     */
    private String class_No;

    /**
     *班级名称
     */
    private String class_Name;

    /**
     *系编号
     */
    private Integer department_Id;

    /**
     *教师编号
     */
    private Integer teacher_Id;

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
     *班级号
     */
    public String getClass_No() {
        return class_No;
    }

    /**
     *班级号
     */
    public void setClass_No(String class_No) {
        this.class_No = class_No == null ? null : class_No.trim();
    }

    /**
     *班级名称
     */
    public String getClass_Name() {
        return class_Name;
    }

    /**
     *班级名称
     */
    public void setClass_Name(String class_Name) {
        this.class_Name = class_Name == null ? null : class_Name.trim();
    }

    /**
     *系编号
     */
    public Integer getDepartment_Id() {
        return department_Id;
    }

    /**
     *系编号
     */
    public void setDepartment_Id(Integer department_Id) {
        this.department_Id = department_Id;
    }

    /**
     *教师编号
     */
    public Integer getTeacher_Id() {
        return teacher_Id;
    }

    /**
     *教师编号
     */
    public void setTeacher_Id(Integer teacher_Id) {
        this.teacher_Id = teacher_Id;
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