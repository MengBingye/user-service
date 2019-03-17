package com.slabs.uservice.service.impl;

import com.slabs.uservice.mapper.UserRoleMapper;
import com.slabs.uservice.model.User;
import com.slabs.uservice.model.UserRole;
import com.slabs.uservice.service.UserRoleService;
import com.slabs.uservice.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;

/**
 * @author BingYe
 * @date 2019/03/17
 */
@Service
@Transactional
@SuppressWarnings("SpringJavaAutowiringInspection")
public class UserRoleServiceImpl extends AbstractService<UserRole> implements UserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public void updateUserRole(final User user) {
        final Condition condition = new Condition(UserRole.class);
        condition.createCriteria().andCondition("user_id = ", user.getId());
        final UserRole userRole = new UserRole()
                .setUserId(user.getId())
                .setRoleId(user.getRoleId());
        this.userRoleMapper.updateByConditionSelective(userRole, condition);
    }
}
