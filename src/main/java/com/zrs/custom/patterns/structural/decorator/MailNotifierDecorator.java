package com.zrs.custom.patterns.structural.decorator;

/**
 * @author zrs
 */
public class MailNotifierDecorator extends BaseNotifierDecorator {

    protected MailNotifierDecorator(INotifier wrapper) {
        super(wrapper);
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("Mail notification...");
    }
}
