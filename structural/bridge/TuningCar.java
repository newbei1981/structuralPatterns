package com.newbie.structural.bridge;

public class TuningCar extends Car{

    protected TuningCar(CarModel carModel){
        super(carModel);
    }

    @Override
    public void createCar(String color) {
        carModel.createModel();
        System.out.println("Well now paint Lexus in " + color + " & some tuning : Factory improvement  !!!");
    }
}
