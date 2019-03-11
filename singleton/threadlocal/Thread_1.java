package com.jy.design.singleton.threadlocal;

/**
 * @author Administrator
 * @ClassName Thread_1
 * @Description TODO
 * @Date 2019/3/11 0011
 * @Version 1.0
 */
public class Thread_1 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
    }
}
