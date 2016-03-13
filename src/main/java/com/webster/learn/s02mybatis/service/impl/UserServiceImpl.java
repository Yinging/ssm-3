package com.webster.learn.s02mybatis.service.impl;

import com.webster.learn.s02mybatis.entity.User;
import com.webster.learn.s02mybatis.mapper.UserMapper;
import com.webster.learn.s02mybatis.service.UserService;
import org.springframework.stereotype.Service;

/**
 * todo
 * Created by Webster on 16/3/10.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements UserService{


}
