package com.jy.design.proxy.issuemodle.dao.impl;

import com.jy.design.proxy.issuemodle.dao.ILogDAO;

/**
 * @author Administrator
 * @ClassName LogDAO
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class LogDAO implements ILogDAO {

    @Override
    public void writeLog() {
        System.out.println("记录日志!");
    }
}
