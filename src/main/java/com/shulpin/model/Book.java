package com.shulpin.model;

public class Book {

    String name;
    Author author;

    public Book() {
        System.out.println("Book.Book empty");
    }

    public String getName() {
        return name;
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
        System.out.println("Book.Book");
        System.out.println("this.name = " + this.name);
        System.out.println("this.author = " + this.author);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Book.setName");
        System.out.println("this.name = " + this.name);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
        System.out.println("Book.setAuthor");
        System.out.println("this.author = " + this.author);
    }

}
