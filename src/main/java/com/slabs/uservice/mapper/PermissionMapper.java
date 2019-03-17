package com.slabs.uservice.mapper;

import com.slabs.uservice.core.mapper.MyMapper;
import com.slabs.uservice.model.Permission;
import com.slabs.uservice.model.Resource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionMapper extends MyMapper<Permission> {
    /**
     * 找到所有权限可控资源
     *
     * @return 资源列表
     */
    List<Resource> findResourceWithHandle();

    /**
     * 找到所有权限可控资源
     *
     * @param roleId 角色id
     * @return 资源列表
     */
    List<Resource> findRoleWithResourceByRoleId(@Param("roleId") Long roleId);

    /**
     * 获取所有权限代码
     *
     * @return 代码列表
     */
    @Select("SELECT p.code FROM `permission` p")
    List<String> findAllCode();

}