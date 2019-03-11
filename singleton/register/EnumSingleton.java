package com.jy.design.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 * @ClassName Register
 * @Description 枚举实现单例模式(不会被反序列化和反射破坏)
 * @Date 2019/2/2 0002
 * @Version 1.0
 */
public enum EnumSingleton implements java.io.Serializable{

    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
