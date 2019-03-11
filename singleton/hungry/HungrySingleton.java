package com.jy.design.singleton.hungry;

/**
 * @author Administrator
 * @ClassName HungrySingleton
 * @Description 饿汉式单例(是线程安全的)
 * @Date 2019/2/2 0002
 * @Version 1.0
 */
public class HungrySingleton implements java.io.Serializable{

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        //防止反射入侵
        if(hungrySingleton != null){
            throw new RuntimeException("不允许构建对象！");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public Object readResolve(){
        return hungrySingleton;
    }
}
