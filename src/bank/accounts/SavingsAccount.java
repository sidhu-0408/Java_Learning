package bank.accounts;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accNo, double balance, double rate) {
        super(accNo, balance); // calling parent constructor
        this.interestRate = rate;
    }

    public void applyInterest() {
        balance += (balance * interestRate / 100);
    }
}
