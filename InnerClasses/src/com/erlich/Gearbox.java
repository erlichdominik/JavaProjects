package com.erlich;

import java.util.AbstractList;
import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear <= this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear is now changed to: " + this.currentGear);
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }


        public double driveSpeed(int revs) {
            return (revs * this.ratio);

        }
    }
}
