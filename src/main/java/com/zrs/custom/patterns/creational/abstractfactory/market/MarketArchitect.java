package com.zrs.custom.patterns.creational.abstractfactory.market;


import com.zrs.custom.patterns.creational.abstractfactory.Architect;

/**
 * @author zrs
 */
public class MarketArchitect implements Architect {

    @Override
    public void design() {
        System.out.println("I am market Architect");
    }
}
