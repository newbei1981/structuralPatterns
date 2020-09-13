package com.newbie.structural.decorator;

public class SmsSenderClient {

    public static void main(String[] args) {
        Notifier sms = new ViberMessage(new FacebookMessage(new Sms()));
        System.out.println(sms.send());
    }
}
