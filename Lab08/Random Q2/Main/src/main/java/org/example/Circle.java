package org.example;


public class Circle implements Shape{

    private double radius;

    //constructor
    public Circle(double radius){
        this.radius=radius;
    }

    //Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Getter method for radius
    public double getRadius() {
        return radius;
    }

    //Inherited methods from shape interface.
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
