package org.example;

public class Triangle implements Shape{
    private double side1,side2,side3,s;

    //constructor
    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }


    //setter method forside1
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    //setter method for side2
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    //setter method for side3
    public void setBase(double side3) {
        this.side3 = side3;
    }


    //Getter method for side1
    public double getSide1() {
        return side1;
    }

    //Getter method for side2
    public double getSide2() {
        return side2;
    }

    //Getter method for side3
    public double getBase() {
        return side3;
    }

    //Inherited methods from shape interface.
    @Override
    public double calculateArea() {
        s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }
}