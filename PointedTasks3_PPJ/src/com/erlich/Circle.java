package com.erlich;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double show() {
        return (Math.PI * Math.pow(radius,2));
    }

    @Override
    Point drawAtPoint(Point center) {
        return new Point(center.getX(), (int)(center.getY() + radius));
    }
}
