package com.test.model;

import com.test.model.tbl_clacousch;

public interface tbl_clacouschMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clacousch
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clacousch
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_clacousch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clacousch
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_clacousch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clacousch
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_clacousch selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clacousch
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_clacousch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clacousch
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_clacousch record);
}