package com.erlich;

public class MethodCarrier {
    public static void main(String[] args) {
        draw(5);
    }

    // n/2 - 1
    public static void draw(int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == counter || j == counter || i == n - (counter + 1) || j == n - (counter + 1)) {
                    System.out.print(counter);
                } else {
                    System.out.print(" ");
                }


            }
            counter ++;
            System.out.println();
        }

    }
}


