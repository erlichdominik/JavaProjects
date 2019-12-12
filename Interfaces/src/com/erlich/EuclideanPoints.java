package com.erlich;

import java.util.Scanner;

public class EuclideanPoints {
    int d;
    double[][] euclideanPoints;

    public EuclideanPoints() {

    }

    public double distanceTo(int d, double[][] euclideanPoints) {
        double sum = 0;

        for (int i = 0; i < d; i++) {
            sum += Math.pow((euclideanPoints[i][0] - euclideanPoints[i][1]),2);
        }
        return Math.sqrt(sum);
    }

}
