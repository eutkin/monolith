package io.github.eutkin.monolith.first.service.model;


public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }
}
