package com.newbie.structural.bridge;

public class PaintConveyor extends Car{

    protected PaintConveyor(CarModel carModel){
        super(carModel);
    }

    @Override
    public void createCar(String color) {
        carModel.createModel();
        System.out.println("Well now paint in " + color);
    }
}
