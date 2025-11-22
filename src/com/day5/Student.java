package com.day5;

public class Student extends Person{
    String type ="Student";

    public Student() {
        super();   // calls parent constructor
        System.out.println("Student constructor called");
    }

    public void printTypes() {
        System.out.println(super.type); // parent variable
        System.out.println(this.type);  // child variable
    }
}
