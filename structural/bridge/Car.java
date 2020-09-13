package com.newbie.structural.bridge;

public abstract class Car {
    protected CarModel carModel;

    public Car(CarModel carModel) {
        this.carModel = carModel;
    }

    public abstract void createCar(String color);
}
