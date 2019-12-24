package com.company;

public class AnimalMain {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        husky.setAge(6);
        husky.printName();
        husky.printDetails();
        husky.run(10);
        System.out.println("tail length = " + husky.getDefaultTailLength());
        System.out.println("weight = " + husky.getWeight());

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();

//
//        Cat cat = new Cat(3);
//        cat.printDetails();

//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetails();

//        husky.eat();
//        husky.getAverageWeight();
//
//        Eagle eagle = new Eagle();
//        eagle.fly(100);
//        eagle.fly();



    }
}
