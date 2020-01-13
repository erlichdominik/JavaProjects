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
            throw new Explosion("boom");
        } else {
            int amountOfFuel = (int)(Math.random() * 20) + 15;
            this.amountOfFuel = amountOfFuel;
        }
    }

    public void drive100km() throws NotEnoughGas {
        if (this.amountOfFuel < 10) {
            throw new NotEnoughGas("Not enough gas");
        } else {
            this.amountOfFuel -= 10;
            this.amountOfKmTravelled += 100;
        }
        System.out.println("Current amount of fuel is: " + this.amountOfFuel);
        System.out.println("Current amount of km travelled is: " + this.amountOfKmTravelled);
    }
}
