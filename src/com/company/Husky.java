package com.company;

public class Husky extends Dog {

    public Husky(int age) {
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
       // super.eat();
        System.out.println("Husky eating");

        super.eat();
    }

    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    protected void printName() {
        System.out.println("Husky name = " + getName());
    }

    @Override
    public int getDefaultTailLength() {
        return 20;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky running at speed = " + speed);
    }
}
