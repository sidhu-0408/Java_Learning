package com.sidhu.oops2;

public abstract class Account {
    String accountnumber;
    double balance;

    Account(String accountnumber, double balance){
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void showBalance(){
        System.out.println("Account :" + accountnumber + " Balance :" + balance);
    }

}
