package com.shulpin.model;

public class Author {

    String name;

    public Author() {

        System.out.println("Author.Author empty");

    }

    public Author(String name) {
        this.name = name;
        System.out.println("Author.Author");
        System.out.println("this.name = " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Author.setName");
        System.out.println("this.name = " + this.name);
    }



}
