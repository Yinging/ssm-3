package com.webster.learn.s02mybatis.service;

import com.webster.learn.s01mvc.BaseTest;
import com.webster.learn.s02mybatis.transaction.CarShopService;
import com.webster.learn.s02mybatis.transaction.Cashier;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * todo
 * Created by Webster on 16/3/11.
 */
public class TransactionTest extends BaseTest {

    @Autowired
    Cashier cashier;

    @Autowired
    CarShopService carShopService;


    @Test
    public void testCarShopService(){
        carShopService.purchase(1,1,2);
    }

    @Test
    public void testCashier(){
        Map<Integer,Integer> cars = new HashMap<>();
        cars.put(1,3);
        cars.put(2,1);
        cashier.checkout(2, cars);
    }

}
