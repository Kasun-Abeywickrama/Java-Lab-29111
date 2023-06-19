package com.mycompany.main;

public abstract class Shape {
    public abstract double calculateArea();
    
     public void display(){
         System.out.println("Area of the object is "+calculateArea());
    }
}
