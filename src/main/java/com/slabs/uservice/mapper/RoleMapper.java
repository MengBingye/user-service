package com.slabs.uservice.mapper;

import com.slabs.uservice.core.mapper.MyMapper;
import com.slabs.uservice.model.Role;
import com.slabs.uservice.model.RoleWithResource;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {


    /**
     * 获取所有角色以及对应的权限
     *
     * @return 角色可控资源列表
     */
    List<RoleWithResource> findRoleWithPermission();

    /**
     * 获取所有角色以及对应的权限
     *
     * @return 角色可控资源列表
     */
    List<RoleWithResource> findRoles();
}