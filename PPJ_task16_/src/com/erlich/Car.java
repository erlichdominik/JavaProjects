package com.erlich;

public class Car {
    private int amountOfFuel;
    private int amountOfKmTravelled;

    public Car() {
        this.amountOfFuel = 35;
        this.amountOfKmTravelled = 0;
    }

    public void fill() {
        double chance = Math.random();
        if (chance > 0 && chance <= 0.1) {
            throw new Explosion();
        } else {
            
        }
    }
}
