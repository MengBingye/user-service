package com.slabs.uservice.mapper;

import com.slabs.uservice.core.mapper.MyMapper;
import com.slabs.uservice.model.RolePermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermissionMapper extends MyMapper<RolePermission> {

    /**
     * 保存角色以及对应的权限ID
     *
     * @param roleId           角色ID
     * @param permissionIdList 权限ID列表
     */
    void saveRolePermission(@Param("roleId") Long roleId,
                            @Param("permissionIdList") List<Integer> permissionIdList);

}