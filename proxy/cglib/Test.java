package com.jy.design.proxy.cglib;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        Job58Platfrom job58Platfrom = new Job58Platfrom();

        Person instance = (Person)job58Platfrom.getInstance(Person.class);

        instance.findJob();
    }
}
