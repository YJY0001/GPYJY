package com.jy.design.adapter;

import com.jy.design.adapter.entity.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @ClassName DBLog
 * @Description TODO
 * @Date 2019/2/5 0005
 * @Version 1.0
 */
public class DBLog implements DBLogApi{

    private FileLogApi fileLog;

    public DBLog(FileLogApi fileLog){
        this.fileLog = fileLog;
    }

    public boolean createLog(List<Log> list) {
        try{
            for (Log log : list) {
                fileLog.writeLog(list);
                System.out.println(log+"|"+"成功写入数据库！");
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateLog(List<Log> list) {
        List<Log> updateLog = new ArrayList<Log>();
        try{
            for (Log log : list) {
                List<Log> listTmp  = fileLog.readLog();
                for (Log logTmp : listTmp) {
                     if(logTmp.getId().equals(log.getId())){
                         updateLog.add(logTmp);
                     }
                }
            }
            fileLog.writeLog(updateLog);
            System.out.println("成功更新据库！");
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteLog(List<Log> list) {
        List<Log> deleteLog = new ArrayList<Log>();
        try{
            for (Log log : list) {
                List<Log> listTmp  = fileLog.readLog();
                for (Log logTmp : listTmp) {
                    if(logTmp.getId().equals(log.getId())){
                        deleteLog.add(logTmp);
                    }
                }
            }
            System.out.println("成功删除据库！");
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public List<Log> findLog() {
        return fileLog.readLog();
    }
}
