package com.day5;

// -------------------------
// Inner classes: Member + Static + Anonymous
// -------------------------
public class Outer {
    private String message = "Hello from Outer";

    // Member Inner Class
    class Inner {
        public void display() {
            System.out.println("Inner says: " + message);
        }
    }

    // Static Inner Class
    static class StaticInner {
        public void show() {
            System.out.println("Inside Static Inner Class");
        }
    }
}
