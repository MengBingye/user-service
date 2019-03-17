package com.slabs.uservice.service.impl;

import com.slabs.uservice.dto.RoleWithPermission;
import com.slabs.uservice.mapper.PermissionMapper;
import com.slabs.uservice.mapper.RoleMapper;
import com.slabs.uservice.mapper.RolePermissionMapper;
import com.slabs.uservice.model.Role;
import com.slabs.uservice.model.RolePermission;
import com.slabs.uservice.model.RoleWithResource;
import com.slabs.uservice.service.RoleService;
import com.slabs.uservice.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author BingYe
 * @date 2019/03/17
 */
@Service
@Transactional
@SuppressWarnings("SpringJavaAutowiringInspection")
public class RoleServiceImpl extends AbstractService<Role> implements RoleService {


    @Resource
    private RoleMapper roleMapper;
    @Resource
    private PermissionMapper permissionMapper;
    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public List<RoleWithResource> findRoleWithPermission() {
        // 由于mybatis在嵌套查询时和pagehelper有冲突
        // 暂时用for循环代替
        //return this.roleMapper.findRoleWithPermission();
        List<RoleWithResource> roles = roleMapper.findRoles();
        roles.forEach(role -> {
            List<com.slabs.uservice.model.Resource> resources = permissionMapper.findRoleWithResourceByRoleId(role.getId());
            role.setResourceList(resources);
        });
        return roles;
    }

    @Override
    public void save(final RoleWithPermission role) {
        this.roleMapper.insert(role);
        this.rolePermissionMapper.saveRolePermission(role.getId(), role.getPermissionIdList());
    }

    @Override
    public void update(final RoleWithPermission role) {
        // 删掉所有权限，再添加回去
        final Condition condition = new Condition(RolePermission.class);
        condition.createCriteria().andCondition("role_id = ", role.getId());
        this.rolePermissionMapper.deleteByCondition(condition);
        this.rolePermissionMapper.saveRolePermission(role.getId(), role.getPermissionIdList());
    }

}
