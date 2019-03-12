package com.jy.design.proxy.issuemodle.entity;

/**
 * @author Administrator
 * @ClassName Log
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Log implements java.io.Serializable{

    private String name;

    public Log(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Log{" +
                "name='" + name + '\'' +
                '}';
    }
}
