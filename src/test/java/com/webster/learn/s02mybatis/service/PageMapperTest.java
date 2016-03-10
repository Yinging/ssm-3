package com.webster.learn.s02mybatis.service;

/**
 * todo
 * Created by Webster on 16/3/10.
 */
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.webster.learn.s01mvc.BaseTest;
import com.webster.learn.s02mybatis.entity.Country;
import com.webster.learn.s02mybatis.mapper.CountryMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 *
 * Created by liuzh on 2015/3/7.
 */
public class PageMapperTest extends BaseTest {

//    @Autowired
//    private CountryMapper countryMapper;

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void test(){
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        Example example = new Example(Country.class);
        example.createCriteria().andGreaterThan("id",100);
        PageHelper.startPage(2, 10);
        List<Country> countries = countryMapper.selectByExample(example);
        PageInfo<Country> pageInfo = new PageInfo<Country>(countries);
        System.out.println(pageInfo.getTotal());

        countries = countryMapper.selectByExample(example);
        pageInfo = new PageInfo<Country>(countries);
        System.out.println(pageInfo.getTotal());
    }
}
