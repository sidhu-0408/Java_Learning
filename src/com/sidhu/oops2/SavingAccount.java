package com.sidhu.oops2;

public class SavingAccount extends Account{
    double intrestRate;

    public SavingAccount(String accountNumber, double balance, double intrestRate){
        super(accountNumber,balance); //code res
        this.intrestRate = intrestRate;
    }
    @Override
    void calculateInterest() {
        double intrest = balance * intrestRate/100;
        System.out.println("Saving Account Intrest: " + intrest);

    }
}
