package com.day5;

// -------------------------
// Parent & Child class to demonstrate super + final
// -------------------------
public class Person {
    String type = "human";

    public Person(){
        System.out.println("Person constructor called");
    }

    public void showType(){
        System.out.println("Type: " + type);
    }
}
