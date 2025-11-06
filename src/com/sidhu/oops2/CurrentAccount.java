package com.sidhu.oops2;

public class CurrentAccount extends Account{
    double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit){
        super(accountNumber,balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    void calculateInterest() {
        System.out.println("Current Account doesn't earn Interest");
    }
}
