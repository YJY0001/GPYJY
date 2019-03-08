package com.jy.design.factory.abstractfactory;

import com.jy.design.factory.abstractfactory.entity.IComputer;
import com.jy.design.factory.abstractfactory.entity.IDisplay;
import com.jy.design.factory.abstractfactory.entity.IMouse;

public interface IFactory {

    IComputer createComputer();

    IMouse createMouse();

    IDisplay createDisplay();
}
