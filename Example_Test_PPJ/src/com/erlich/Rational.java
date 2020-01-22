package com.erlich;

public class Rational {
    private int num, denom;

    public Rational(int num, int denom) {
        if (denom == 0) {
            throw new ArithmeticException("cant divide by 0 ");
        } else {
            this.num = num;
            this.denom = denom;
        }
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public Rational getOpposite() {
        Rational rational = null;

        int tmp = this.denom;
        this.denom = this.num;
        this.num = tmp;

        if (denom == 0) {
            throw new ArithmeticException("cant divide by 0");
        } else {
            rational = new Rational(num, denom);
        }

        return rational;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "num=" + num +
                ", denom=" + denom +
                '}';
    }
}
