package com.slabs.uservice.service;

import com.slabs.uservice.model.Permission;
import com.slabs.uservice.core.service.Service;
import com.slabs.uservice.model.Resource;

import java.util.List;

/**
 * @author BingYe
 * @date 2019/03/17
 */
public interface PermissionService extends Service<Permission> {
    /**
     * 找到所有权限可控资源
     *
     * @return 资源列表
     */
    List<Resource> findResourceWithHandle();

    /**
     * 找到角色权限可控资源
     *
     * @param roleId 角色id
     * @return 资源列表
     */
    List<Resource> findRoleWithResourceByRoleId(Long roleId);
}
