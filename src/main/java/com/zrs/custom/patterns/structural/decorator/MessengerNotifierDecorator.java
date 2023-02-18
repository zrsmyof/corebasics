package com.zrs.custom.patterns.structural.decorator;

/**
 * @author zrs
 */
public class MessengerNotifierDecorator extends BaseNotifierDecorator {

    protected MessengerNotifierDecorator(INotifier wrapper) {
        super(wrapper);
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("Messenger notification...");
    }
}
