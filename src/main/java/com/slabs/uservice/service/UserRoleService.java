package com.slabs.uservice.service;

import com.slabs.uservice.model.User;
import com.slabs.uservice.model.UserRole;
import com.slabs.uservice.core.service.Service;

/**
 * @author BingYe
 * @date 2019/03/17
 */
public interface UserRoleService extends Service<UserRole> {
    /**
     * 更新用户角色
     *
     * @param user 用户
     */
    void updateUserRole(User user);
}
