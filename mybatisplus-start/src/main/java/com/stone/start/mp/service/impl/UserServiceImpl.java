package com.stone.start.mp.service.impl;

import com.stone.start.mp.dal.entity.User;
import com.stone.start.mp.dal.mapper.UserMapper;
import com.stone.start.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author stone
 * @since 2023-06-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
