package com.jy.design.prototype.issuemodule.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @ClassName Issue
 * @Description 产品实体
 * @Date 2019/3/11 0011
 * @Version 1.0
 */
public class Issue extends Base implements java.io.Serializable,Cloneable{


    private static final long serialVersionUID = -5689953246968281231L;


    private String name;

    private String catagory;

    private String nameHTML;

    private String uid;

    private Double price;

    private Integer stock;

    private User user;

    List<Attribute> attrlist = new ArrayList<Attribute>();

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

    public String getNameHTML() {
        return nameHTML;
    }

    public void setNameHTML(String nameHTML) {
        this.nameHTML = nameHTML;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Attribute> getAttrlist() {
        return attrlist;
    }

    public void setAttrlist(List<Attribute> attrlist) {
        this.attrlist = attrlist;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "name='" + name + '\'' +
                ", catagory='" + catagory + '\'' +
                ", nameHTML='" + nameHTML + '\'' +
                ", uid='" + uid + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", user=" + user +
                ", attrlist=" + attrlist +
                '}';
    }
}
