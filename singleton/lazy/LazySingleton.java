package com.jy.design.singleton.lazy;

/**
 * @author Administrator
 * @ClassName LazySingleton
 * @Description 懒汉式单例(线程不安全)
 * @Date 2019/2/2 0002
 * @Version 1.0
 */
public class LazySingleton implements java.io.Serializable{

    private static LazySingleton instance = null;

    private LazySingleton(){

        //防止反射入侵(防止不了)
        if(instance != null){
            throw new RuntimeException("不允许构建对象！");
        }

    }

    //线程不安全写法
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }


    //线程安全写法(double check)
    public static LazySingleton getInstanceOne(){
         if(instance == null){
             synchronized (LazySingleton.class){
                 if(instance == null){
                     instance = new LazySingleton();
                 }
             }
         }
         return instance;
    }

    //线程安全写法(这种会有几率出现死锁)
   public synchronized static LazySingleton getInstanceTwo(){
       if(instance == null){
           if(instance == null){
               instance = new LazySingleton();
           }
       }
       return instance;
   }

    //防止反序列化破坏单例
    public Object readResolve(){
        return instance;
    }

}
