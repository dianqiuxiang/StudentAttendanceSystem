package com.test.model;

public class tbl_power {
    /**
     *
     */
    private Integer id;

    /**
     *权限编码
     */
    private String powerCode;

    /**
     *权限名称
     */
    private String powerName;

    /**
     *描述
     */
    private String description;

    /**
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *权限编码
     */
    public String getPowerCode() {
        return powerCode;
    }

    /**
     *权限编码
     */
    public void setPowerCode(String powerCode) {
        this.powerCode = powerCode == null ? null : powerCode.trim();
    }

    /**
     *权限名称
     */
    public String getPowerName() {
        return powerName;
    }

    /**
     *权限名称
     */
    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
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