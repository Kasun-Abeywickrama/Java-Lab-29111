package org.example;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        System.out.println("Area of the Circle : "+c1.calculateArea());
        System.out.println("Perpendicular of the Circle : "+c1.calculatePerimeter());

        Rectangle r1 = new Rectangle(10,15);
        System.out.println("\nArea of the Rectangle : "+r1.calculateArea());
        System.out.println("Perpendicular of the Rectangle : "+r1.calculatePerimeter());

        Triangle t1 = new Triangle(5,4,6);
        System.out.println("\nArea of the Triangle : "+t1.calculateArea());
        System.out.println("Perpendicular of the Triangle : "+t1.calculatePerimeter());
    }
}