package com.jy.design.adapter.entity;


import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Administrator
 * @ClassName Log
 * @Description TODO
 * @Date 2019/2/4 0004
 * @Version 1.0
 */
public class Log {

    private String id;

    private String desc;

    private Date create;

    public Log(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", create=" + create +
                '}';
    }
}
