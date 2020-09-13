package com.newbie.structural.proxy;

public class UserContent implements VideoContent{
    private String url;

    public UserContent(String url) {
        this.url = url;
        loadContent();
    }

    public void loadContent(){
        System.out.println("Wait...Now content is loading ... from : " + url);
    }

    @Override
    public void showVideo() {
        System.out.println("Video download! Select and see :)");
    }
}
