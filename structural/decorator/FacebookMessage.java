package com.newbie.structural.decorator;

public class FacebookMessage extends SmsDecorator {

    public FacebookMessage(Notifier wrapper) {
        super(wrapper);
    }

    public String sendFacebook(){
        return "& Send message to client Facebook page! ";
    }

    @Override
    public String send(){
        return super.send() + sendFacebook();
    }
}
