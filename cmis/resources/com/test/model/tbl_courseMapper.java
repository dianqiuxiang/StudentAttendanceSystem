package com.test.model;

import com.test.model.tbl_course;

public interface tbl_courseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_course
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_course
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_course
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_course
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_course selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_course
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_course
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_course record);
}