package com.johnny;

public class Car extends Vehicle {
    private final String brand;

    public Car(int id, String brand) {
        super(id);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void drive() {
        System.out.println("Driving my " + brand);
    }
}
