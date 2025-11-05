package com.sidhu.oops;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",2025);
        Car car2 = new ElectricCar("TESLA ",2025,300);

        car1.start();
        car2.start();;
    }
}
