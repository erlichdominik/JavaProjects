package com.erlich;

public class Car {
    private int amountOfFuel;
    private int kilometersTravelled;

    public Car() {
        this.amountOfFuel = 35;
        this.kilometersTravelled = 0;
    }

    public void fill() throws Explosion{
        int randomNumber = (int)(Math.random() * 100 + 1);
        if (randomNumber >= 0 && randomNumber <= 10) {
            throw new Explosion("BOOOM" );
        } else {
            this.amountOfFuel += (int)(Math.random() * 20 + 15);
            System.out.println("current amount of fuel is " + this.amountOfFuel);
        }
    }

    public void drive100km() throws NotEnoughGas {
        if (this.amountOfFuel < 10) {
            throw new NotEnoughGas("not enough gas");
        } else {
            this.amountOfFuel -= 10;
            this.kilometersTravelled += 100;
            System.out.println(this.kilometersTravelled + " driven " + this.amountOfFuel + " left");
        }

    }

}
