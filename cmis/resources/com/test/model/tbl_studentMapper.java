package com.test.model;

import com.test.model.tbl_student;

public interface tbl_studentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_student
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_student
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_student
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_student
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_student selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_student
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_student
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_student record);
}