package com.slabs.uservice.service.impl;

import com.slabs.uservice.mapper.PermissionMapper;
import com.slabs.uservice.mapper.RolePermissionMapper;
import com.slabs.uservice.model.RolePermission;
import com.slabs.uservice.service.RolePermissionService;
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
public class RolePermissionServiceImpl extends AbstractService<RolePermission> implements RolePermissionService {
    @Resource
    private PermissionMapper permissionMapper;

}
