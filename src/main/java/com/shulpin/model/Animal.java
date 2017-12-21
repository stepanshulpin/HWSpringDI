package com.shulpin.model;

public class Animal {

    protected int qtnPaws;

    public Animal(int qtnPaws) {
        this.qtnPaws = qtnPaws;
        System.out.println("Animal.Animal parent");
        System.out.println("qtnPaws = " + qtnPaws);
    }
}
