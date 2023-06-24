package org.example;

public interface MyFirstInterface {
        //int x;  error :- A value must be assigned for a final variable.
        int x = 10;
        //public static final int x = 10; //No error :- This method is also working properly.

        void display();
        //abstract void display(); //No error :- This method is also working properly.
}

