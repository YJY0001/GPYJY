package com.jy.design.prototype.deepclone;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 * @ClassName Monkey
 * @Description TODO
 * @Date 2019/2/7 0007
 * @Version 1.0
 */
public class Monkey implements Serializable {

    private int height;
    private int weight;
    private Date birthday;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
