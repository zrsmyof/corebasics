package com.zrs.custom.patterns.creational.abstractfactory.bank;

import com.zrs.custom.patterns.creational.abstractfactory.Developer;

/**
 * @author zrs
 */
public class BankPythonDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("I am bank python developer");
    }
}
