package org.example;

public class IntefaceImplemented implements MyFirstInterface {

    @Override
    public void display() {
        //x = 20; // Cannot assign a value to final variable 'x'
        System.out.println("The value of x is : " + x);
    }
}