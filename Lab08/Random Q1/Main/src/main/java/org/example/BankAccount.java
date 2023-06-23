package org.example;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;

    //Setter methods for Account number and balance.
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Getter methods for Account number and balance.
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //abstract method
    public abstract double calculateInterest();
}
