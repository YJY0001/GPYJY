package com.jy.design.factory.factory;

import com.jy.design.factory.factory.entity.DZCar;
import com.jy.design.factory.factory.entity.ICar;

/**
 * @author Administrator
 * @ClassName DZCarFactory
 * @Description TODO
 * @Date 2019/3/7 0007
 * @Version 1.0
 */
public class DZCarFactory implements ICarFactory{

    @Override
    public ICar create() {
        return new DZCar();
    }

}
