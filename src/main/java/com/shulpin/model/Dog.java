package com.shulpin.model;

public class Dog extends Animal {

    String name;

    public Dog(int qtnPaws, String name) {
        super(qtnPaws);
        this.name = name;
        System.out.println("Dog.Dog");
        System.out.println("qtnPaws = " + qtnPaws);
        System.out.println("name = " + name);
    }
}
