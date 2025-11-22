package com.day5;

public class AnonymousExample {
    public void runAnonymous() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable is running...");
            }
        };

        new Thread(r).start();
    }
}
