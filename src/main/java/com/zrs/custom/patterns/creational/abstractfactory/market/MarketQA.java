package com.zrs.custom.patterns.creational.abstractfactory.market;


import com.zrs.custom.patterns.creational.abstractfactory.QA;

/**
 * @author zrs
 */
public class MarketQA implements QA {

    @Override
    public void writeTest() {
        System.out.println("I am market QA");
    }
}
