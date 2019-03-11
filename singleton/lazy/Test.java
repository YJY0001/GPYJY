package com.jy.design.singleton.lazy;

import com.jy.design.singleton.hungry.HungrySingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/3/11 0011
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //测试线程是否安全
//        for(int i=0;i<10;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    //LazySingleton lazySingleton = LazySingleton.getInstanceOne();
//                    //LazySingleton lazySingleton = LazySingleton.getInstanceTwo();
//                    //LazySingleton lazySingleton = LazySingleton.getInstance();
//                    LazySingletonByClass lazySingleton = LazySingletonByClass.getInstance();
//                    System.out.println(lazySingleton);
//                }
//            }).start();
//        }

        //反射入侵测试
        try{
              //测试懒汉式内部类单例
//            Class<?> clazz = LazySingletonByClass.class;
//            Constructor constructor = clazz.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            LazySingletonByClass lazySingletonByClass = (LazySingletonByClass) constructor.newInstance();

            //测试懒汉式单例
            Class<?> clazz = LazySingleton.class;
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            LazySingleton lazySingleton = (LazySingleton)declaredConstructor.newInstance();
            Object o1 = lazySingleton;
            Object o2 = LazySingleton.getInstanceOne();
            System.out.println(o1 == o2);

        }catch (Exception e){
            e.printStackTrace();
        }


        //序列化入侵
        LazySingletonByClass object1 = null;
        LazySingletonByClass object2 = LazySingletonByClass.getInstance();


        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("LazySingletonByClass.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("LazySingletonByClass.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            object1 = (LazySingletonByClass)ois.readObject();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }


//        LazySingleton object1 = null;
//        LazySingleton object2 = LazySingleton.getInstance();
//
//
//        FileOutputStream fos = null;
//
//        try{
//            fos = new FileOutputStream("LazySingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(object2);
//            oos.flush();
//            oos.close();
//
//            FileInputStream fis = new FileInputStream("LazySingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            object1 = (LazySingleton)ois.readObject();
//            ois.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        System.out.println(object1 == object2);
    }
}
