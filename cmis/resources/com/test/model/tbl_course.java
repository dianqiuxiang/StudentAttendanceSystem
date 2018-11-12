package com.test.model;

public class tbl_course {
    /**
     *主键
     */
    private Integer id;

    /**
     *课程号
     */
    private String course_No;

    /**
     *课程名
     */
    private String course_Name;

    /**
     *学分
     */
    private Integer course_Gredit;

    /**
     *学时
     */
    private String course_Hours;

    /**
     *授课学期
     */
    private String course_Term;

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
     *课程号
     */
    public String getCourse_No() {
        return course_No;
    }

    /**
     *课程号
     */
    public void setCourse_No(String course_No) {
        this.course_No = course_No == null ? null : course_No.trim();
    }

    /**
     *课程名
     */
    public String getCourse_Name() {
        return course_Name;
    }

    /**
     *课程名
     */
    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name == null ? null : course_Name.trim();
    }

    /**
     *学分
     */
    public Integer getCourse_Gredit() {
        return course_Gredit;
    }

    /**
     *学分
     */
    public void setCourse_Gredit(Integer course_Gredit) {
        this.course_Gredit = course_Gredit;
    }

    /**
     *学时
     */
    public String getCourse_Hours() {
        return course_Hours;
    }

    /**
     *学时
     */
    public void setCourse_Hours(String course_Hours) {
        this.course_Hours = course_Hours == null ? null : course_Hours.trim();
    }

    /**
     *授课学期
     */
    public String getCourse_Term() {
        return course_Term;
    }

    /**
     *授课学期
     */
    public void setCourse_Term(String course_Term) {
        this.course_Term = course_Term == null ? null : course_Term.trim();
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