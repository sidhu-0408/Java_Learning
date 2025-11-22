package bank.main;

import bank.accounts.SavingsAccount;
import bank.customers.Customer;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA123", 5000, 5.0);

        Customer c = new Customer("Sidhu", sa);

        c.showCustomerDetails();

        System.out.println("\nDepositing 2000...");
        c.depositMoney(2000);

        System.out.println("\nApplying interest...");
        c.addInterest();

        System.out.println("\nFinal Details:");
        c.showCustomerDetails();
    }
}
