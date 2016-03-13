package com.webster.learn.s02mybatis.transaction.impl;

import java.util.Map;

import com.webster.learn.s02mybatis.transaction.CarShopService;
import com.webster.learn.s02mybatis.transaction.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cashier")
public class CashierImpl implements Cashier {

	@Autowired
	private CarShopService carShopService;
	


    @Transactional
    @Override
    public void checkout(int userId, Map<Integer, Integer> carIds) {
        /*遍历map的最佳方法,速度较快*/
        for (Map.Entry<Integer, Integer> carId : carIds.entrySet()) {
            carShopService.purchase(userId, carId.getKey(),carId.getValue());
        }
    }
}
