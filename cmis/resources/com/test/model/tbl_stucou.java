package com.test.model;

public class tbl_stucou {
    /**
     *主键
     */
    private Integer id;

    /**
     *学生编号
     */
    private Integer student_Id;

    /**
     *课程编号
     */
    private Integer course_Id;

    /**
     *成绩
     */
    private String grade;

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
     *成绩
     */
    public String getGrade() {
        return grade;
    }

    /**
     *成绩
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
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