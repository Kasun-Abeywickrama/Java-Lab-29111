package org.example;

public interface MyFirstInterface {
        //int x;  error :- A value must be assigned for a final variable.
        int x = 10;
        //public static final int x = 10; //No error :- This method is also working properly.

        <br>void display();
        //abstract void display(); //No error :- This method is also working properly.
}

/*public class MyFirstInterface {
    int x = 10;

    //void display(); // Error :- A normal class cannot keep abstract method(A method without body).
    void display(){
                  x = 20;
                  System.out.println("The value of x is : "+x);
    }
}*/