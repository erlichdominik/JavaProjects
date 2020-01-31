package com.erlich;

public class Fruit {
    String name;
    int seedNumber;

    public Fruit(String name, int seedNumber) {
        this.name = name;
        this.seedNumber = seedNumber;
    }

    @Override
    public String toString() {
        return this.name + " " + this.seedNumber + "\n";
    }
}
