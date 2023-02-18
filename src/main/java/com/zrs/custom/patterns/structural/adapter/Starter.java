package com.zrs.custom.patterns.structural.adapter;

/**
 * @author zrs
 */
public class Starter {

    public static void main(String[] args) {
        Car honda = new Honda();
        CarAdapterImpl carAdapter = new CarAdapterImpl(honda);
        System.out.println(carAdapter.getSpeed());
    }
}
