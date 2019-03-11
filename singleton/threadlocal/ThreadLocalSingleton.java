package com.jy.design.singleton.threadlocal;

/**
 * @author Administrator
 * @ClassName ThreadLocalSingleton
 * @Description 线程间的安全单例[伪线程安全]
 * @Date 2019/3/11 0011
 * @Version 1.0
 */
public class ThreadLocalSingleton {


    private ThreadLocalSingleton(){}


    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}
