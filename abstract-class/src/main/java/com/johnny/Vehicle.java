package com.johnny;

public abstract class Vehicle {

    private final int id;

    public Vehicle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract void drive();
}
