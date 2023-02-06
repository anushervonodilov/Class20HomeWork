package com.class20HomeWork;

public class Shape {

    double radius;

    Shape(double radius) {
        this.radius = radius;
    }

}

class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }

    void circleArea() {
        System.out.println(radius * radius);
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.circleArea();

    }

}
