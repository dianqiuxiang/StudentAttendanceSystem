package com.test.model;

public class Tbl_user {
    /**
     *编号
     */
    private Integer id;

    /**
     *用户名
     */
    private String username;

    /**
     *密码
     */
    private String pwd;

    /**
     *教师编号（外键）
     */
    private Integer teacherid;

    /**
     *学生编号（外键）
     */
    private Integer studentid;

    /**
     *教师还是学生
     */
    private Integer tec_or_stu;

    /**
     *描述
     */
    private String description;

    /**
     *编号
     */
    public Integer getId() {
        return id;
    }

    /**
     *编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     *用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     *密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     *密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     *教师编号（外键）
     */
    public Integer getTeacherid() {
        return teacherid;
    }

    /**
     *教师编号（外键）
     */
    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    /**
     *学生编号（外键）
     */
    public Integer getStudentid() {
        return studentid;
    }

    /**
     *学生编号（外键）
     */
    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    /**
     *教师还是学生
     */
    public Integer getTec_or_stu() {
        return tec_or_stu;
    }

    /**
     *教师还是学生
     */
    public void setTec_or_stu(Integer tec_or_stu) {
        this.tec_or_stu = tec_or_stu;
    }

    /**
     *描述
     */
    public String getDescription() {
        return description;
    }

    /**
     *描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}