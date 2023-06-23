package org.example;

public class Rectangle implements Shape{
    private double length, width;

    //constructor
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    //Setter method for length.
    public void setLength(double length) {
        this.length = length;
    }

    //Setter method for width.
    public void setWidth(double width) {
        this.width = width;
    }

    //Getter method for length.
    public double getLength() {
        return length;
    }

    //Getter method for width.
    public double getWidth() {
        return width;
    }

    //Inherited methods from shape interface.
    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return (2*length)+(2*width);
    }
}