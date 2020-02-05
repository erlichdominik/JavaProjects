package com.erlich;

public class Main {

    public static void main(String[] args) {
//        drawSquare(5);
//        drawShape(5);
        drawPyramid(7);
        System.out.println("hello");
    }

    static void drawSquare(int n) {
        for (int col = 0; col < n; col++) {

            for (int row = 0; row < n; row++) {

                if (col == 0 || col == n -1 || row == 0 || row == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void drawShape(int n) {
        for (int col = n; col >= 0; col--) {
            for (int row = col; row < n; row++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void drawPyramid(int n) {
        for (int i = n; i >= 0; i-=2) {

            for (int j = 0; j < i/2; j++) {
                System.out.print(" ");
            }

            for (int x = 0; x < (n - i) + 1; x++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
