package com.slabs.uservice.model;

import javax.persistence.*;

@Table(name = "role_permission")
public class RolePermission {
    /**
     * 角色Id
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限Id
     */
    @Id
    @Column(name = "permission_id")
    private Long permissionId;

    /**
     * 获取角色Id
     *
     * @return role_id - 角色Id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色Id
     *
     * @param roleId 角色Id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限Id
     *
     * @return permission_id - 权限Id
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * 设置权限Id
     *
     * @param permissionId 权限Id
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}