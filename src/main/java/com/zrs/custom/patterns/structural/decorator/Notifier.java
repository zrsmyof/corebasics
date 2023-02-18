package com.zrs.custom.patterns.structural.decorator;

/**
 * @author zrs
 */
public class Notifier implements INotifier {
    @Override
    public void sendNotification() {
        System.out.println("Simple notification...");
    }
}
