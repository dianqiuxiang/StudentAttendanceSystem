package com.test.model;

import com.test.model.tbl_userpower;

public interface tbl_userpowerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userpower
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userpower
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_userpower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userpower
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_userpower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userpower
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_userpower selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userpower
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_userpower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userpower
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_userpower record);
}