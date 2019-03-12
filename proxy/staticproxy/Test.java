package com.jy.design.proxy.staticproxy;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/2/20 0020
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
