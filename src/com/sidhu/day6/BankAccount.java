package com.sidhu.day6;

public class BankAccount {

    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("✅ Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be positive.");
            return;
        }
        if (balance < amount) {
            System.out.println("❌ Insufficient balance! Current Balance: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("✅ Withdrawn: " + amount);
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}
