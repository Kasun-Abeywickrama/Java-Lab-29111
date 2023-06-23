package org.example;

public class SavingsAccounts extends BankAccount{
    private static double savings_interest_rate = 12;
    @Override
    public double calculateInterest() {
        double interest = getBalance()*savings_interest_rate/100;
        return interest;
    }
}
