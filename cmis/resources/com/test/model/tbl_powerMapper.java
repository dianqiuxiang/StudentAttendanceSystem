package com.test.model;

import com.test.model.tbl_power;

public interface tbl_powerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_power
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_power
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insert(tbl_power record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_power
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int insertSelective(tbl_power record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_power
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    tbl_power selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_power
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(tbl_power record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_power
     *
     * @mbggenerated Mon Apr 02 17:38:14 CST 2018
     */
    int updateByPrimaryKey(tbl_power record);
}