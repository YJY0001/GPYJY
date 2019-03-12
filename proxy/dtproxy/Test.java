package com.jy.design.proxy.dtproxy;

/**
 * @author Administrator
 * @ClassName Test
 * @Description TODO
 * @Date 2019/2/20 0020
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception{

        Person person = (Person) new JDK58().getInstance(new YuJianYi());

        person.findJob();
    }
}
