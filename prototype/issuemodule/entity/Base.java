package com.jy.design.prototype.issuemodule.entity;

import java.util.Date;

/**
 * @author Administrator
 * @ClassName Base
 * @Description 基础实体
 * @Date 2019/3/11 0011
 * @Version 1.0
 */
public class Base implements java.io.Serializable,Cloneable{

    private static final long serialVersionUID = -7690832454332771016L;

    private Integer id;

    private Date createTime;

    private Date modifyTime;

    private String createUser;

    private String modifyUser;

    public Base(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", createUser='" + createUser + '\'' +
                ", modifyUser='" + modifyUser + '\'' +
                '}';
    }
}
