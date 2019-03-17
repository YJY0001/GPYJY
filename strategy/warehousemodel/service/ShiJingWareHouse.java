package com.jy.design.strategy.warehousemodel.service;

import com.jy.design.strategy.warehousemodel.entity.Issue;
/**
 * @author Administrator
 * @ClassName ShiJingWareHouse
 * @Description TODO
 * @Date 2019/3/17 0017
 * @Version 1.0
 */
public class ShiJingWareHouse implements WareHouse{

    @Override
    public boolean uploadIssue(Issue issue) {
        System.out.println("上传商品到石井仓库！");
        return false;
    }
}
