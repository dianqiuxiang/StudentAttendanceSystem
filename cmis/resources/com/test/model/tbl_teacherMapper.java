package com.test.model;

import com.test.model.tbl_teacher;

public interface tbl_teacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacher
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacher
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacher
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacher
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_teacher selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacher
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacher
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_teacher record);
}