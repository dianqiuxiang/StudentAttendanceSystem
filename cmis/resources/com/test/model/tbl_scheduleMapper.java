package com.test.model;

import com.test.model.tbl_schedule;

public interface tbl_scheduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_schedule
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_schedule
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_schedule
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_schedule
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_schedule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_schedule
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_schedule
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_schedule record);
}