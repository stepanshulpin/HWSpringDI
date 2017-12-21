package com.shulpin.model;

public class Circle {

    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
        System.out.println("Circle.Circle");
        System.out.println("color = " + color);
        System.out.println("radius = " + radius);
    }
}
