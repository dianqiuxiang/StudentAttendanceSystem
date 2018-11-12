package com.test.model;

public class tbl_userpower {
    /**
     *主键（自增）
     */
    private Integer id;

    /**
     *用户编号（外键）
     */
    private Integer user_id;

    /**
     *权限编号（外键）
     */
    private Integer power_id;

    /**
     *主键（自增）
     */
    public Integer getId() {
        return id;
    }

    /**
     *主键（自增）
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *用户编号（外键）
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *用户编号（外键）
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     *权限编号（外键）
     */
    public Integer getPower_id() {
        return power_id;
    }

    /**
     *权限编号（外键）
     */
    public void setPower_id(Integer power_id) {
        this.power_id = power_id;
    }
}