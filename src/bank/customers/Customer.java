package bank.customers;

import bank.accounts.SavingsAccount;

public class Customer {
    public String name;
    private SavingsAccount account; // composition (has-a)

    public Customer(String name, SavingsAccount account) {
        this.name = name;
        this.account = account;
    }

    public void showCustomerDetails() {
        System.out.println("Customer: " + name);
        account.showDetails();
    }

    public void depositMoney(double amount) {
        account.deposit(amount);
    }

    public void addInterest() {
        account.applyInterest();
    }
}
