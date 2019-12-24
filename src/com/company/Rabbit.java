package com.company;

public class Rabbit extends Animal {

    public Rabbit(){
//        super().setAge();

//        this(0);
//        super.setAge(3);
//        this.setAge(3);
    }

    public Rabbit(int age){
//        super();
//        setAge(3);


        super(3);
    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    public void printName() {

    }
}
