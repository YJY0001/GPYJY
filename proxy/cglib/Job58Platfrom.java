package com.jy.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @ClassName Job58Platfrom
 * @Description 动态代理
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class Job58Platfrom implements MethodInterceptor {


    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object object = methodProxy.invokeSuper(o, objects);
        after();
        return object;
    }

    private void after() {
        System.out.println("寻找完毕，请看是否符合您！");
    }

    private void before() {
        System.out.println("接到你的信息，开始了解你的需求！");
    }


}
