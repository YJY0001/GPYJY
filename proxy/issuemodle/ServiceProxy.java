package com.jy.design.proxy.issuemodle;

import com.jy.design.proxy.issuemodle.dao.ILogDAO;
import com.jy.design.proxy.issuemodle.dao.impl.LogDAO;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @ClassName IssueServiceProxy
 * @Description TODO
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class ServiceProxy implements MethodInterceptor {

    private ILogDAO iLogDAO;

    public ServiceProxy(){
        this.iLogDAO = new LogDAO();
    }


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
        System.out.println("记录日志后--------------！");
    }

    private void before() {
        System.out.println("记录日志前--------------！");
        iLogDAO.writeLog();
    }
}
