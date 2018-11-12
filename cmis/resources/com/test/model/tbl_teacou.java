package com.test.model;

public class tbl_teacou {
    /**
     *主键
     */
    private Integer id;

    /**
     *教师编号
     */
    private Integer teacher_Id;

    /**
     *课程编号
     */
    private Integer course_Id;

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
     *课程编号
     */
    public Integer getCourse_Id() {
        return course_Id;
    }

    /**
     *课程编号
     */
    public void setCourse_Id(Integer course_Id) {
        this.course_Id = course_Id;
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