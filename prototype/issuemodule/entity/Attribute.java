package com.jy.design.prototype.issuemodule.entity;

/**
 * @author Administrator
 * @ClassName Attribute
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Attribute extends Base implements java.io.Serializable{

    private static final long serialVersionUID = 6024274485331700388L;

    private String name;

    private String value;

    private String attrid;

    public Attribute(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAttrid() {
        return attrid;
    }

    public void setAttrid(String attrid) {
        this.attrid = attrid;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", attrid='" + attrid + '\'' +
                '}';
    }
}
