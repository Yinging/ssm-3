package com.webster.learn.s02mybatis.service;

import com.webster.learn.s02mybatis.entity.User;
import com.webster.learn.s02mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * todo
 * Created by Webster on 16/3/10.
 */
@Service
public class UserService extends BaseService<UserMapper,User> {
}
