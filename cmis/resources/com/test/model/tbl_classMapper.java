package com.test.model;

import com.test.model.tbl_class;

public interface tbl_classMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_class
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_class
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_class
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_class
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_class selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_class
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_class
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_class record);
}