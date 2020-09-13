package com.newbie.structural.decorator;

public class Sms implements Notifier {
    @Override
    public String send() {
        return "Send SMS to client! ";
    }
}
