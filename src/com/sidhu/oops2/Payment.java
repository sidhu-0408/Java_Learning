package com.sidhu.oops2;

public interface Payment {
    void pay(double amount);

    default void showTransaction() {
        System.out.println("Transaction processed securely.");
    }
}
