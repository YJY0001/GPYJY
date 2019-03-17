package com.jy.design.adapter;

import com.jy.design.adapter.entity.Log;

import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @ClassName FileLog
 * @Description TODO
 * @Date 2019/2/4 0004
 * @Version 1.0
 */
public class FileLog implements FileLogApi{

    public List<Log> readLog() {
        List<Log> list = new ArrayList<Log>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try{
            fis = new FileInputStream(new File("F:\\project\\java\\WCP_V1\\src\\design\\src\\main\\resources\\log\\log.txt"));
            isr = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                    String[] tmp = line.split(",");
                    Log log = new Log();
                    log.setId(tmp[0]);
                    log.setDesc(tmp[1]);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date = sdf.parse(tmp[2]);
                    log.setCreate(date);
                    list.add(log);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                br.close();
                isr.close();
                fis.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeLog(List<Log> list) {
        String str = "";
        Writer writer = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            writer = new FileWriter("F:\\project\\java\\WCP_V1\\src\\design\\src\\main\\resources\\log\\log.txt",true);
            for (Log log : list) {
                str = log.getId()+","+log.getDesc()+","+sdf.format(log.getCreate());
                writer.write(str+"\t\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                writer.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
