package com.laowen.auth.dao;

import com.laowen.auth.domain.SysResources;

import java.util.List;

/**
 * 系统资源操作
 */
public interface SysResourcesMapper {

    /**
     * 添加
     *
     * @param sysResources
     * @return
     */
    int insertOne(SysResources sysResources);

    /**
     * 根据id查询
     *
     * @param resourcesId
     * @return
     */
    SysResources selectById(String resourcesId);

    /**
     * 查询列表
     *
     * @return
     */
    List<SysResources> selectList(SysResources sysResources);

    /**
     * 更新
     *
     * @param sysResources
     * @return
     */
    int updateById(SysResources sysResources);

}