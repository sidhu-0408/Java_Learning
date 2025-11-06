package com.sidhu.oops2;

public class Main {
    public static void main(String[] args) {
        Account sa = new SavingAccount("SA001", 5000, 4.5);
        Account ca = new CurrentAccount("CA001", 10000, 2000);

        sa.showBalance();
        sa.calculateInterest();

        ca.showBalance();
        ca.calculateInterest();
    }
}
