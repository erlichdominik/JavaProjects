package com.erlich;

public class RationalEx {
    public static void main(String[] args) {
        Rational rational = new Rational(1,2);
        System.out.println(rational.toString());
        rational.getOpposite();
        System.out.println(rational.toString());
    }



}
