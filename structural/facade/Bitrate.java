package com.newbie.structural.facade;

public class Bitrate {
    public static void readAudio(String file){
        System.out.println(file + " audio read !");
    }

    public static void audioConvert(String file){
        System.out.println(file + " audio convert & ready to play!");
    }
}