package com.day5;

public class Employee {
    private static int idCounter = 1;   // shared across all objects

    private int empId;
    private String name;

    // static block – runs once when class is loaded
    static {
        System.out.println("Employee class loaded (static block)");
    }

    public Employee(String name) {
        this.name = name;
        this.empId = idCounter++;  // auto ID
    }

    public void show() {
        System.out.println("ID: " + empId + ", Name: " + name);
    }

    public static void showTotalEmployees() {
        System.out.println("Total Employees = " + (idCounter - 1));
    }
}
