package com.erlich;

public class Square {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public void show() {
        System.out.println("area of the square: " + Math.pow(edge,2));
        System.out.println("volume of the cube: " + Math.pow(edge,3));
    }

    public void showCylinder() {
        // we have s
        System.out.println("radius of cylinder is: " + edge/2);
        System.out.println("height of the cylinder is: " + edge);
        System.out.println("base surface area is: " + Math.PI * (edge/2) * 4);
        System.out.println("volume of cylinder is: " + Math.PI * (Math.pow(edge,2)));
    }
}
