package com.newbie.structural.bridge;

public class ModelLada implements CarModel {
    @Override
    public void createModel() {
        System.out.println("Assembling the Lada machine (cheep)   :(  !");
    }
}
