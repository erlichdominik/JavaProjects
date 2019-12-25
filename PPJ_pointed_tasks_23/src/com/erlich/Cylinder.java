package com.erlich;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void show() {
        System.out.println("surface area of cylinder is: " + (2*Math.PI*Math.pow(radius,2)
                + 2*Math.PI * radius * height));
        System.out.println("volume of cylinder is: " + (Math.PI * Math.pow(radius,2) * height));
    }
}
