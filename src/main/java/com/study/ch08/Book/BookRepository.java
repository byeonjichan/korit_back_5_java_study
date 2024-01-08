package com.study.ch08.Book;

import java.util.spi.AbstractResourceBundleProvider;

public class BookRepository {
    // book 배열 선언
    Book[] books;

    // 생성자
    public BookRepository(Book[] books) {
        this.books = books;
    }

    void insert(Book book) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
            }
        }
    }
}
