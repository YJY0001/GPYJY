package com.jy.design.prototype.clone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Administrator
 * @ClassName Car
 * @Description
 * @Date 2019/2/2 0002
 * @Version 1.0
 */
public class Car extends Base implements Cloneable{

    private String name;

    private Base base;

    private List<String> list;

    private Set<Base> set;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Set<Base> getSet() {
        return set;
    }

    public void setSet(Set<Base> set) {
        this.set = set;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
