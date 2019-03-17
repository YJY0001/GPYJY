package com.jy.design.adapter;

import com.jy.design.adapter.entity.Log;

import java.util.List;

/**
 * @author Administrator
 * @ClassName FileLogApi
 * @Description TODO
 * @Date 2019/2/4 0004
 * @Version 1.0
 */
public interface FileLogApi {

    List<Log> readLog();

    void writeLog(List<Log> list);
}
