package com.webster.learn.s02mybatis.service.impl;

import com.webster.learn.s02mybatis.entity.Country;
import com.webster.learn.s02mybatis.mapper.CountryMapper;
import com.webster.learn.s02mybatis.service.CountryService;
import org.springframework.stereotype.Service;

/**
 * todo
 * Created by Webster on 16/3/10.
 */
@Service("countryService")
public class CountryServiceImpl extends BaseServiceImpl<CountryMapper,Country> implements CountryService{
}
