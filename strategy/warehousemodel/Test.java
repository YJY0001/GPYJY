package com.jy.design.strategy.warehousemodel;

import com.jy.design.strategy.warehousemodel.entity.Issue;
import com.jy.design.strategy.warehousemodel.service.HaiFuWareHouse;
import com.jy.design.strategy.warehousemodel.service.WareHouseStrategy;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/3/17 0017
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        WareHouseStrategy wareHouse = new WareHouseStrategy(new HaiFuWareHouse());
        Issue issue = new Issue();
        boolean upload = wareHouse.upload(issue);
    }
}
