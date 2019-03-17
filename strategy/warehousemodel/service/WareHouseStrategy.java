package com.jy.design.strategy.warehousemodel.service;


import com.jy.design.strategy.warehousemodel.entity.Issue;

/**
 * @author Administrator
 * @ClassName WareHouseStrategy
 * @Description TODO
 * @Date 2019/3/17 0017
 * @Version 1.0
 */
public class WareHouseStrategy {

    private WareHouse wareHouse;

    public WareHouseStrategy(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public boolean upload(Issue issue){
         return wareHouse.uploadIssue(issue);
    }
}
