package com.company;

public class Cat extends Animal {

    public Cat(int age) {
        super(age);
        System.out.println("Cat");
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void printName() {

    }
}
