package com.slabs.uservice.service.impl;

import com.slabs.uservice.mapper.PermissionMapper;
import com.slabs.uservice.model.Permission;
import com.slabs.uservice.service.PermissionService;
import com.slabs.uservice.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author BingYe
 * @date 2019/03/17
 */
@Service
@Transactional
@SuppressWarnings("SpringJavaAutowiringInspection")
public class PermissionServiceImpl extends AbstractService<Permission> implements PermissionService {
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<com.slabs.uservice.model.Resource> findResourceWithHandle() {
        return this.permissionMapper.findResourceWithHandle();
    }

    @Override
    public List<com.slabs.uservice.model.Resource> findRoleWithResourceByRoleId(Long roleId) {
        return this.permissionMapper.findRoleWithResourceByRoleId(roleId);
    }
}
