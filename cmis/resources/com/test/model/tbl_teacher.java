package com.test.model;

public class tbl_teacher {
    /**
     *主键
     */
    private Integer id;

    /**
     *教师工号
     */
    private String teacher_No;

    /**
     *教师姓名
     */
    private String teacher_Name;

    /**
     *系号
     */
    private Integer department_Id;

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
     *教师工号
     */
    public String getTeacher_No() {
        return teacher_No;
    }

    /**
     *教师工号
     */
    public void setTeacher_No(String teacher_No) {
        this.teacher_No = teacher_No == null ? null : teacher_No.trim();
    }

    /**
     *教师姓名
     */
    public String getTeacher_Name() {
        return teacher_Name;
    }

    /**
     *教师姓名
     */
    public void setTeacher_Name(String teacher_Name) {
        this.teacher_Name = teacher_Name == null ? null : teacher_Name.trim();
    }

    /**
     *系号
     */
    public Integer getDepartment_Id() {
        return department_Id;
    }

    /**
     *系号
     */
    public void setDepartment_Id(Integer department_Id) {
        this.department_Id = department_Id;
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