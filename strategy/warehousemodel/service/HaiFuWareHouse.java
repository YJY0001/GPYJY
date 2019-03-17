package com.jy.design.strategy.warehousemodel.service;

import com.jy.design.strategy.warehousemodel.entity.Issue;
/**
 * @author Administrator
 * @ClassName HaiFuWareHouse
 * @Description TODO
 * @Date 2019/3/17 0017
 * @Version 1.0
 */
public class HaiFuWareHouse implements WareHouse{

    @Override
    public boolean uploadIssue(Issue issue) {
        System.out.println("上传商品到海富仓库！");
        return true;
    }
}
