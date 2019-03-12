package com.jy.design.proxy.staticproxy;

/**
 * @author Administrator
 * @ClassName Father
 * @Description TODO
 * @Date 2019/2/20 0020
 * @Version 1.0
 */
public class Father {

    private Person person;

    public Father(Person person){
         this.person = person;
    }

    public void findLove(){
        System.out.println("根据你的要求寻找!");
        this.person.findLove();
        System.out.println("双方家长是否同意!");
    }
}
