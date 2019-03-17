package com.jy.design.adapter;

import com.jy.design.adapter.entity.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/2/4 0004
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        DBLogApi DBLog = new DBLog(new FileLog());

        System.out.println(DBLog.findLog());
    }
}
