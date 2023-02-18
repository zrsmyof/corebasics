package com.zrs.custom.patterns.creational.abstractfactory.market;

import com.zrs.custom.patterns.creational.abstractfactory.Developer;

/**
 * @author zrs
 */
public class MarketPythonDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("I am market python developer");
    }
}
