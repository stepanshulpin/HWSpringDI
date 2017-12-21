package com.shulpin.model;

public class Cat extends Animal {

    private String name;

    public Cat(int qtnPaws, String name) {
        super(qtnPaws);
        this.name = name;
        System.out.println("Cat.Cat");
        System.out.println("qtnPaws = " + qtnPaws);
        System.out.println("name = " + name);
    }
}
