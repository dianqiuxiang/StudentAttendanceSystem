package com.test.model;

public class tbl_clacousch {
    /**
     *主键
     */
    private Integer id;

    /**
     *班号
     */
    private Integer class_Id;

    /**
     *课程号
     */
    private Integer course_Id;

    /**
     *上课时间表id
     */
    private Integer schedule_Id;

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
     *班号
     */
    public Integer getClass_Id() {
        return class_Id;
    }

    /**
     *班号
     */
    public void setClass_Id(Integer class_Id) {
        this.class_Id = class_Id;
    }

    /**
     *课程号
     */
    public Integer getCourse_Id() {
        return course_Id;
    }

    /**
     *课程号
     */
    public void setCourse_Id(Integer course_Id) {
        this.course_Id = course_Id;
    }

    /**
     *上课时间表id
     */
    public Integer getSchedule_Id() {
        return schedule_Id;
    }

    /**
     *上课时间表id
     */
    public void setSchedule_Id(Integer schedule_Id) {
        this.schedule_Id = schedule_Id;
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