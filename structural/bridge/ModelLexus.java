package com.newbie.structural.bridge;

public class ModelLexus implements CarModel {
    @Override
    public void createModel() {
        System.out.println("Assembling the Lexus machine (expensive)   :)  !");
    }
}
