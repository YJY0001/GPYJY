package com.jy.design.factory.factory;

/**
 * @author Administrator
 * @ClassName TestFactory
 * @Description TODO
 * @Date 2019/3/7 0007
 * @Version 1.0
 */
public class TestFactory {

    public static void main(String[] args) {
        ICarFactory factory = new DZCarFactory();
        System.out.println(factory.create());
    }
}
