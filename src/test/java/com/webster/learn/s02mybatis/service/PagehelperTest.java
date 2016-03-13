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
import com.webster.learn.s02mybatis.service.impl.CountryServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 *
 * Created by liuzh on 2015/3/7.
 */
public class PagehelperTest extends BaseTest {


    @Autowired
    CountryServiceImpl service;

    @Test
    public void testStartPage() {

        Example example = new Example(Country.class);
        example.createCriteria()
                .andGreaterThan("id", 0);

//        example.setOrderByClause("id desc");
        //获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(19, 10);
        //和上面的setOrderByClause()都管用,只用一个就行了,同时使用后执行的覆盖前面的
        PageHelper.orderBy("countrycode desc");
        //紧跟着的第一个select方法会被分页
        List<Country> countries = service.selectByExample(example);
        log.debug("==============================================");
        log.debug(countries.toString());

        PageInfo<Country> pageInfo = new PageInfo<>(countries);
        log.debug("==============================================");
        log.debug("共【{}】条",pageInfo.getTotal());
        log.debug("共【{}】页",pageInfo.getPages());
        log.debug("每页【{}】条",pageInfo.getPageSize());
        log.debug("当前是第【{}】页",pageInfo.getPageNum());
        log.debug("当前页共【{}】条",pageInfo.getSize());
        log.debug("从第【{}】条起始",pageInfo.getStartRow());
        log.debug("到第【{}】条结束",pageInfo.getEndRow());
        log.debug("排序方式为【{}】",pageInfo.getOrderBy());



    }

    @Autowired
    SqlSession sqlSession;
    @Test
    public void testSession() {
        CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);

            //pageSize=0的时候查询全部结果
            PageHelper.startPage(19, 10);
            List<Country> list = mapper.selectAll();

            log.debug("==============================================");
            log.debug(list.toString());


    }



}

