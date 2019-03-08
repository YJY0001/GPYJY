package com.jy.design.factory.abstractfactory;

import com.jy.design.factory.abstractfactory.entity.*;

/**
 * @author Administrator
 * @ClassName QHFactory
 * @Description TODO
 * @Date 2019/3/7 0007
 * @Version 1.0
 */
public class QHFactory implements IFactory{
    @Override
    public IComputer createComputer() {
        return new QHComputer();
    }

    @Override
    public IMouse createMouse() {
        return new QHMouse();
    }

    @Override
    public IDisplay createDisplay() {
        return new QHDisplay();
    }
}
