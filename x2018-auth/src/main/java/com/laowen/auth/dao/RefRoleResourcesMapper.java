package com.laowen.auth.dao;

import com.laowen.auth.domain.RefRoleResources;

public interface RefRoleResourcesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ref_role_resources
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String refId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ref_role_resources
     *
     * @mbg.generated
     */
    int insert(RefRoleResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ref_role_resources
     *
     * @mbg.generated
     */
    int insertSelective(RefRoleResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ref_role_resources
     *
     * @mbg.generated
     */
    RefRoleResources selectByPrimaryKey(String refId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ref_role_resources
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RefRoleResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ref_role_resources
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RefRoleResources record);
}