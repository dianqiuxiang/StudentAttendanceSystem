package com.test.model;

import com.test.model.tbl_teacou;

public interface tbl_teacouMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacou
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacou
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_teacou record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacou
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_teacou record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacou
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_teacou selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacou
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_teacou record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_teacou
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_teacou record);
}