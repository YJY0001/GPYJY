package com.jy.design.prototype.clone;

import com.jy.design.prototype.clone.Car;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Administrator
 * @ClassName Test
 * @Description 浅克隆
 * @Date 2019/2/2 0002
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        Base base = new Base();
        base.setBaseName("BaseName");
        car.setName("car0001");
        car.setList(new ArrayList<String>());
        car.setSet(new HashSet<Base>());
        car.getList().add("1");
        car.getSet().add(base);
        car.setBase(base);
        try{
            Car carClone = (Car)car.clone();
            System.out.println(carClone.getName());
            System.out.println(carClone.getList());
            System.out.println(carClone.getBase().getBaseName());
            for (Base b : carClone.getSet()) {
                System.out.println(b.getBaseName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
