package com.zrs.custom.patterns.structural.decorator;

/**
 * @author zrs
 */
public class Starter {
    public static void main(String[] args) {
        new SMSNotifierDecorator(new Notifier()).sendNotification();
        System.out.println("***************************");
        new SMSNotifierDecorator(new MailNotifierDecorator(new MessengerNotifierDecorator(new Notifier()))).sendNotification();
    }
}
