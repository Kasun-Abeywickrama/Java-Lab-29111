package org.example;

public class CheckingAccounts extends BankAccount{
    private static double checking_interest_rate = 2;

    @Override
    public double calculateInterest() {
        double interest = getBalance()*checking_interest_rate/100;
        return interest;
    }
}
