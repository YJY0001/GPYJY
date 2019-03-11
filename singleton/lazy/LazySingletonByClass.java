package com.jy.design.singleton.lazy;

import javax.management.ObjectName;

/**
 * @author Administrator
 * @ClassName LazySingletonByClass
 * @Description 内部类作为单例模式
 * @Date 2019/3/11 0011
 * @Version 1.0
 */
public class LazySingletonByClass implements java.io.Serializable{

    private LazySingletonByClass(){
        //防止反射入侵
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许构建对象！");
        }
    }

    public static final LazySingletonByClass getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazySingletonByClass INSTANCE = new LazySingletonByClass();
    }

    //防止反序列化破坏单例
    public Object readResolve(){
        return LazyHolder.INSTANCE;
    }

}
