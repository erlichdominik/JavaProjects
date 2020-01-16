package com.erlich;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double show() {
        return this.width * this.height;
    }

    @Override
    Point drawAtPoint(Point center) {
        return new Point((int)(center.getX()-this.height/2),(int)(center.getY()+this.width/2));
    }


}
