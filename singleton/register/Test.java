package com.jy.design.singleton.register;

import com.jy.design.singleton.lazy.LazySingleton;
import com.jy.design.singleton.lazy.LazySingletonByClass;

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

        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setObject(new Object());
        System.out.println(instance.getObject());


        //线程安全测试(线程安全)
//        for(int i=0;i<10;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    EnumSingleton instance = EnumSingleton.getInstance();
//                    System.out.println(instance.getObject());
//                }
//            }).start();
//        }

        //反射入侵测试(枚举不被反射破坏)
        try{

            Class<?> clazz = EnumSingleton.class;
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class,int.class);
            declaredConstructor.setAccessible(true);
            EnumSingleton EnumSingleton = (EnumSingleton)declaredConstructor.newInstance();
            Object o1 = EnumSingleton;
            Object o2 = EnumSingleton.getInstance();
            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }

        //序列化入侵(返回true)
        EnumSingleton object1 = null;
        EnumSingleton object2 = EnumSingleton.getInstance();


        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            object1 = (EnumSingleton)ois.readObject();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(object1 == object2);


        //线程安全测试(线程安全)
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Test instance = (Test)ContainerSingleton.getBean("com.jy.design.singleton.register.Test");
                    System.out.println(instance);
                }
            }).start();
        }
    }
}
