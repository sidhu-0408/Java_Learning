package com.sidhu.day6;

import java.util.*;
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("🏦 BANK ACCOUNT SIMULATOR");
        System.out.println("==============================");

        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account;
        System.out.println("1. Saving Account  2. Current Account");
        System.out.print("Select account type: ");
        int accType = scanner.nextInt();

        if (accType == 1) account = new SavingAccount(accNo, initialBalance);
        else account = new CurrentAccount(accNo, initialBalance);

        int choice;

        do {
            System.out.println("\n--------- MENU ---------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = scanner.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = scanner.nextDouble();
                    account.withdraw(wd);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("👋 Exiting... Thank you for using Bank App!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
