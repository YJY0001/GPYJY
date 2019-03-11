package com.jy.design.singleton.hungry;

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
        //测试线程是否安全
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                    System.out.println(hungrySingleton);
                }
            }).start();
        }


        //测试反射入侵
        try{
            Class<?> clazz = HungrySingleton.class;
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);

            Object o1 = declaredConstructor.newInstance();
            Object o2 = HungrySingleton.getInstance();
            System.out.println(o1 == o2);

        }catch (Exception e){
            e.printStackTrace();
        }

        //反序列化破快单例
        HungrySingleton object1 = null;
        HungrySingleton object2 = HungrySingleton.getInstance();

        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("HungrySingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("HungrySingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            object1 = (HungrySingleton)ois.readObject();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(object1 == object2);

    }
}
