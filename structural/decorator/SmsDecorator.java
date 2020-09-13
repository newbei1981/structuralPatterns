package com.newbie.structural.decorator;

public class SmsDecorator implements Notifier{
    Notifier wrapper;

    public SmsDecorator(Notifier wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String send() {
        return wrapper.send();
    }
}
