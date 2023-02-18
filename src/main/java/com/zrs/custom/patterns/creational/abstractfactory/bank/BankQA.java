package com.zrs.custom.patterns.creational.abstractfactory.bank;


import com.zrs.custom.patterns.creational.abstractfactory.QA;

/**
 * @author zrs
 */
public class BankQA implements QA {

    @Override
    public void writeTest() {
        System.out.println("I am bank QA");
    }
}
