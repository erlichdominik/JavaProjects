package com.erlich;

public class Car {
    private int amountOfFuel;
    private int kilometersTravelled;

    public Car() {
        this.amountOfFuel = 35;
        this.kilometersTravelled = 0;
    }

    public void fill(){
        if (Math.random() < 0.1) {
            throw new Explosion("BOOOM" );
        } else {
            this.amountOfFuel += (int)(Math.random() * 20 + 15);
            System.out.println("current amount of fuel is " + this.amountOfFuel);
        }
    }

    public void drive100km() throws NotEnoughGas {
        if (this.amountOfFuel < 10) {
            System.out.println("only " + this.amountOfFuel + " left, must fill the tank");
            throw new NotEnoughGas("not enough gas");
        } else {
            this.amountOfFuel -= 10;
            this.kilometersTravelled += 100;
            System.out.println(this.kilometersTravelled + " driven " + this.amountOfFuel + " left");
        }



    }

}
