package com.jy.design.factory.abstractfactory;

import com.jy.design.factory.abstractfactory.entity.*;

/**
 * @author Administrator
 * @ClassName HAFactory
 * @Description TODO
 * @Date 2019/3/7 0007
 * @Version 1.0
 */
public class HAFactory implements IFactory{

    @Override
    public IComputer createComputer() {
        return new HAComputer();
    }

    @Override
    public IMouse createMouse() {
        return new HAMouse();
    }

    @Override
    public IDisplay createDisplay() {
        return new HADisplay();
    }
}
