package com.zrs.custom.patterns.creational.singletone;

/**
 * @author zrs
 */
public class SingleBank {

    private static volatile SingleBank singleBank;

    private SingleBank() {
    }

    public static SingleBank getInstance() {
        if (singleBank == null) {
            synchronized (SingleBank.class) {
                if (singleBank == null) {
                    singleBank = new SingleBank();
                }
            }
        }
        return singleBank;
    }
}
