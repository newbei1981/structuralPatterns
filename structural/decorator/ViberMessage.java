package com.newbie.structural.decorator;

public class ViberMessage extends SmsDecorator {

    public ViberMessage(Notifier wrapper) {
        super(wrapper);
    }

    public String sendViber(){
        return "& Send message to client Viber ";
    }

    @Override
    public String send(){
        return super.send() + sendViber();
    }
}
