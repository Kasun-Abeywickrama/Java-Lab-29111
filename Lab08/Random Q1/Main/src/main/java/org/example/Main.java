package org.example;


public class Main {
    public static void main(String[] args) {
        CheckingAccounts c1 = new CheckingAccounts();
        c1.setAccountNumber(1234);
        c1.setBalance(1000000.00f);
        System.out.println("Interest in checking account : "+c1.calculateInterest());

        SavingsAccounts s1 = new SavingsAccounts();
        s1.setAccountNumber(1235);
        s1.setBalance(20000000.00f);
        System.out.println("Interest in savings account : "+s1.calculateInterest());
    }
}