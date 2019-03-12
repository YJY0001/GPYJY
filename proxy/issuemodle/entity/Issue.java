package com.jy.design.proxy.issuemodle.entity;

/**
 * @author Administrator
 * @ClassName Issue
 * @Description 商品实体
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Issue implements java.io.Serializable{


    private static final long serialVersionUID = -1489879628592065126L;


    private String name;

    public Issue(){}

    @Override
    public String toString() {
        return "Issue{" +
                "name='" + name + '\'' +
                '}';
    }
}
