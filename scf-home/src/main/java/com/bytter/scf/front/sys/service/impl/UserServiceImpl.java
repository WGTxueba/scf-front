package com.bytter.scf.front.sys.service.impl;

import com.bytter.scf.front.sys.entity.User;
import com.bytter.scf.front.sys.mapper.UserMapper;
import com.bytter.scf.front.sys.service.UserService;
import com.bytter.scf.core.base.impl.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 前置用户表 服务实现类
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@Service
public class UserServiceImpl extends BaseService<UserMapper, User> implements UserService {

}
