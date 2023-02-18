package com.zrs.custom.patterns.structural.adapter;

/**
 * @author zrs
 */
public class CarAdapterImpl implements CarAdapter {

    private final Car car;

    public CarAdapterImpl(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertSpeedToKm(car.getSpeed());
    }

    private double convertSpeedToKm(double mph) {
        return mph * 1.60934;
    }
}
