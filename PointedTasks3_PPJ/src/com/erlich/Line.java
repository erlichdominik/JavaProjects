package com.erlich;

public class Line{
    private double slope;
    private double intercept;

    public Line(Point point1, Point point2) {
        double deltaY = (point2.getY() - point1.getY());
        double deltaX = (point2.getX() - point1.getX());
        this.slope = deltaY/deltaX;
//        int a = point2.getY() - point1.getY(); //deltaY
//        int b = point1.getX() - point2.getX();
//        int c = a*(point1.getX()) + b*(point1.getY());
//        this.intercept = c;

        double xx = point1.getY() - this.slope*point1.getX();
        this.intercept = xx;
    }



}
