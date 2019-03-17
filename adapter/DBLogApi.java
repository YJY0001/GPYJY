package com.jy.design.adapter;

import com.jy.design.adapter.entity.Log;

import java.util.List;

/**
 * @author Administrator
 * @ClassName DBLogApi
 * @Description TODO
 * @Date 2019/2/5 0005
 * @Version 1.0
 */
public interface DBLogApi {

    boolean createLog(List<Log> list);

    boolean updateLog(List<Log> list);

    boolean deleteLog(List<Log> list);

    List<Log> findLog();
}
