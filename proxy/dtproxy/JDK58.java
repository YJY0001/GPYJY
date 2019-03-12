package com.jy.design.proxy.dtproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 * @ClassName JDK58
 * @Description TODO
 * @Date 2019/2/20 0020
 * @Version 1.0
 */
public class JDK58 implements InvocationHandler {

    private Person person;

    public Object getInstance(Person person) throws Exception{
        this.person = person;

        Class<?> clazz = person.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始寻找!");
        method.invoke(this.person,args);
        System.out.println("如果合适的话，就准备办事!");
        return null;
    }
}
