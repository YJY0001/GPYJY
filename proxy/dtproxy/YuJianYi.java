package com.jy.design.proxy.dtproxy;

/**
 * @author Administrator
 * @ClassName YuJianYi
 * @Description TODO
 * @Date 2019/2/20 0020
 * @Version 1.0
 */
public class YuJianYi implements Person{

    @Override
    public void findLove(){
        System.out.println("白富美");
        System.out.println("身高160cm");
        System.out.println("胸大");
    }

    @Override
    public void findJob() {
        System.out.println("IT");
        System.out.println("15K");
    }
}
