package com.newbie.structural.facade;

public class Demo {
    public static void main(String[] args) {
        FacadeVideoPlayer player = new FacadeVideoPlayer();
        player.playVideoFile("Terminator.avi");
    }
}
