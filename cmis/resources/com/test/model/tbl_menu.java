package com.test.model;

public class tbl_menu {
    /**
     *编号（主键，不自增）
     */
    private Integer id;

    /**
     *菜单名称
     */
    private String name;

    /**
     *路径
     */
    private String path;

    /**
     *父级菜单ID
     */
    private Integer parentID;

    /**
     *序号
     */
    private Integer sequence;

    /**
     *图标路径
     */
    private String iconImage;

    /**
     *是否启用
     */
    private Integer isEnable;

    /**
     *描述
     */
    private String description;

    /**
     *编号（主键，不自增）
     */
    public Integer getId() {
        return id;
    }

    /**
     *编号（主键，不自增）
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     *菜单名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *路径
     */
    public String getPath() {
        return path;
    }

    /**
     *路径
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     *父级菜单ID
     */
    public Integer getParentID() {
        return parentID;
    }

    /**
     *父级菜单ID
     */
    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    /**
     *序号
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     *序号
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     *图标路径
     */
    public String getIconImage() {
        return iconImage;
    }

    /**
     *图标路径
     */
    public void setIconImage(String iconImage) {
        this.iconImage = iconImage == null ? null : iconImage.trim();
    }

    /**
     *是否启用
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     *是否启用
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
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