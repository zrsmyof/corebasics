package com.zrs.custom.patterns.structural.decorator;

/**
 * @author zrs
 */
public class SMSNotifierDecorator extends BaseNotifierDecorator {

    protected SMSNotifierDecorator(INotifier wrapper) {
        super(wrapper);
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("SMS notification...");
    }
}
