package com.study.ch08.Book;

public class BookService {
    BookRepository bookRepository;

    void append(Book book) {
        bookRepository.insert(book);
    }
}
