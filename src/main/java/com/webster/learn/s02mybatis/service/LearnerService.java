package com.webster.learn.s02mybatis.service;


import com.webster.learn.s02mybatis.entity.Learner;

import java.util.List;
import java.util.Set;

/**
 * 业务层 接口
 * Created by Webster on 2016/2/22.
 */
public interface LearnerService {
    int insert(Learner learner);

    int update(Learner learner);

    int delete(Integer id);

    List<Learner> selectAll();

    int countAll();

    Learner findById(Integer id);

    Learner findByName(String name);

    Set<String> getRoles(String name);

    Set<String> getPermissions(String name);
}
