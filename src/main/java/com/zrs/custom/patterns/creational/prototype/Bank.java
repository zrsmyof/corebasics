package com.zrs.custom.patterns.creational.prototype;

/**
 * @author zrs
 */
public class Bank implements Prototype {

    private String name;
    private String address;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Bank(Bank bank) {
        this.name = bank.name;
        this.address = bank.address;
    }

    @Override
    public Prototype clone() {
        return new Bank(this);
    }
}
