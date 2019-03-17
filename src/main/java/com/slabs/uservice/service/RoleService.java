package com.slabs.uservice.service;

import com.slabs.uservice.dto.RoleWithPermission;
import com.slabs.uservice.model.Role;
import com.slabs.uservice.core.service.Service;
import com.slabs.uservice.model.RoleWithResource;

import java.util.List;

/**
 * @author BingYe
 * @date 2019/03/17
 */
public interface RoleService extends Service<Role> {
    /**
     * 新建角色
     *
     * @param role 带权限列表的角色
     */
    void save(RoleWithPermission role);

    /**
     * 更新角色
     *
     * @param role 带权限列表的角色
     */
    void update(RoleWithPermission role);

    /**
     * 获取所有角色以及对应的权限
     *
     * @return 角色可控资源列表
     */
    List<RoleWithResource> findRoleWithPermission();
}
