package com.company;

public class Bear extends Animal implements HasTail, CanRun, Omnivore {


    @Override
    protected void printName() {
        System.out.println("Bear");
    }

    @Override
    public int getDefaultTailLength() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 700;
    }

    @Override
    public void run(int speed) {

    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat");
    }

    @Override
    public void eatPlants() {
        System.out.println("Bear eating plants");
    }
}
