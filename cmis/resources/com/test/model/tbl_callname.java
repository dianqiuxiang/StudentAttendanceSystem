package com.test.model;

public class tbl_callname {
    /**
     *主键
     */
    private Integer id;

    /**
     *课表编号
     */
    private Integer clacousch_Id;

    /**
     *学生编号
     */
    private Integer student_Id;

    /**
     *课程编号
     */
    private Integer course_Id;

    /**
     *出勤状态
     */
    private String state;

    /**
     *备注信息
     */
    private String remark;

    /**
     *点名时间
     */
    private String callname_Time;

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
     *课表编号
     */
    public Integer getClacousch_Id() {
        return clacousch_Id;
    }

    /**
     *课表编号
     */
    public void setClacousch_Id(Integer clacousch_Id) {
        this.clacousch_Id = clacousch_Id;
    }

    /**
     *学生编号
     */
    public Integer getStudent_Id() {
        return student_Id;
    }

    /**
     *学生编号
     */
    public void setStudent_Id(Integer student_Id) {
        this.student_Id = student_Id;
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
     *出勤状态
     */
    public String getState() {
        return state;
    }

    /**
     *出勤状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     *备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     *备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     *点名时间
     */
    public String getCallname_Time() {
        return callname_Time;
    }

    /**
     *点名时间
     */
    public void setCallname_Time(String callname_Time) {
        this.callname_Time = callname_Time == null ? null : callname_Time.trim();
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