package com.mycompany.main;

public class Circle extends Shape{
    
    double radius;
   
    public Circle(double radius){
        this.radius =radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    
    
}