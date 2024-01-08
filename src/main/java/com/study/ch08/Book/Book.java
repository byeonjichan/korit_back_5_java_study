package com.study.ch08.Book;

public class Book {
    String name;
    String writer;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

    public Book(String name, String writer) {
        this.name = name;
        this.writer = writer;
    }
}
