package com.jy.design.factory.abstractfactory;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/3/7 0007
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        IFactory factory = new HAFactory();
        System.out.println(factory.createComputer());
        System.out.println(factory.createDisplay());
        System.out.println(factory.createMouse());
    }
}
