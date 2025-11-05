package com.sidhu.oops;

public class ElectricCar extends Car {

    int batteryCapacity;
    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year); // calling parent constructor
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void start(){
        System.out.println(brand + " Electric car started");
    }
}
