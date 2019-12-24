package com.company;

public abstract class Animal {
    private int age;
    protected String name;

    public Animal(){}

    public Animal(int age) {
        System.out.println("Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void printName();

    public void printDetails(){
//        System.out.println("name = " + this.getName()
//                + " age = " + this.getAge());

        printName();
        System.out.println("age = " + age);

        System.out.println("name = " + name
                + " age = " + age);
    }

    public void eat(){
        System.out.println("Animal eating");
    }

    public double getAverageWeight(){
        return 10.0;
    }

    public abstract int getWeight();
}
