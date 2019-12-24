package com.company;

public class Snake extends Reptile {

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    protected double getWeight() {
        return 10d;
    }
}
