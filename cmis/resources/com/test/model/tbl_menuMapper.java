package com.test.model;

import com.test.model.tbl_menu;

public interface tbl_menuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_menu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_menu record);
}