package com.newbie.structural.bridge;

public class CarConveyor {
    public static void main(String[] args) {
        Car[] cars = {
                new PaintConveyor(new ModelLada()),
                new TuningCar(new ModelLexus())
        };
        for (Car car:cars){
            car.createCar("Red");
        }
    }
}
