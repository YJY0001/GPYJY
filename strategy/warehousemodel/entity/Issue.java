package com.jy.design.strategy.warehousemodel.entity;

/**
 * @author Administrator
 * @ClassName Issue
 * @Description TODO
 * @Date 2019/3/17 0017
 * @Version 1.0
 */
public class Issue implements java.io.Serializable{

    private static final long serialVersionUID = -6450440983288632984L;

    private String id;
    private String name;
    private String catagory;

    public Issue(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", catagory='" + catagory + '\'' +
                '}';
    }
}
