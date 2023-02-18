package com.zrs.custom.patterns.creational.abstractfactory.bank;


import com.zrs.custom.patterns.creational.abstractfactory.Architect;

/**
 * @author zrs
 */
public class BankArchitect implements Architect {

    @Override
    public void design() {
        System.out.println("I am bank Architect");
    }
}
