package com.jy.design.singleton.threadlocal;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/3/11 0011
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Thread_1 t1 = new Thread_1();
        Thread_1 t2 = new Thread_1();

        t1.start();
        t2.start();

    }
}
