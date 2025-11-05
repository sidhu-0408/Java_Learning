package com.sidhu.oops;

public class Car {
    String brand;
    int year;

    void start(){
        System.out.println(brand + " Car is started..");
    }

    public Car(){
        System.out.println("Constrcutor called");
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Copy constructor
    public Car(Car other) {
        this.brand = other.brand;
        this.year = other.year;
    }

}
