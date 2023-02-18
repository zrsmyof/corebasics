package com.zrs.custom.patterns.structural.decorator;

/**
 * @author zrs
 */
public abstract class BaseNotifierDecorator implements INotifier {

    private final INotifier wrapper;

    protected BaseNotifierDecorator(INotifier wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void sendNotification() {
        wrapper.sendNotification();
    }
}
