package com.webster.learn.s02mybatis.service.impl;


import com.webster.learn.s02mybatis.entity.Learner;
import com.webster.learn.s02mybatis.mapper.LearnerMapper;
import com.webster.learn.s02mybatis.service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Set;

/**
 * 业务层 实现
 * Created by Webster on 2016/2/22.
 */

@Service
@Transactional
public class LearnerServiceImpl implements LearnerService {

    @Autowired(required = false)
    private LearnerMapper mapper;


    /**
     *
     * 使用缓存,则不用再访问数据库
     */
//    @Cacheable(value = "myCache" ,key="#id + 'findById'")
    @Cacheable(value = "sysCache" )
    @Override
    public Learner findById(Integer id) {
        System.out.println("@@@@@=>select from db");
        return this.mapper.findById(id);

    }

    @Override
    public Learner findByName(String name) {
        return this.mapper.findByName(name);

    }


    @Override
    public Set<String> getRoles(String name) {
        //todo 获取角色

        return null;
    }

    @Override
    public Set<String> getPermissions(String name) {
        //todo 获取权限
        return null;
    }

    @Override
    public int insert(Learner user) {
        return this.mapper.insert(user);
    }

    @Override
    public int update(Learner user) {
        return this.mapper.update(user);

    }

    @Override
    public int delete(Integer id) {
        return this.mapper.delete(id);

    }

    @Override
    public List<Learner> selectAll() {
        return this.mapper.selectAll();

    }

    @Override
    public int countAll() {
        return this.mapper.countAll();

    }





}
