package com.company;

public abstract class Dog extends Animal implements HasTail, CanRun {

    public Dog(int age) {
        super(age);
        System.out.println("Dog");

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }

    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 30.0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public int getDefaultTailLength() {
        return 5;
    }
}
