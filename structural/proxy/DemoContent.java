package com.newbie.structural.proxy;

public class DemoContent {
    public static void main(String[] args) {
        VideoContent videoContent = new UserContent("http://youtube.com/funny/lastweek");

        videoContent.showVideo();
    }
}
