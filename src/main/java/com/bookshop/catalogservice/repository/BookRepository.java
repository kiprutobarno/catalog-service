package com.bookshop.catalogservice.repository;

import java.util.Optional;

import com.bookshop.catalogservice.models.Book;

public interface BookRepository {
    Iterable<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    Book save(Book book);

    void deleteByIsbn(String isbn);
}
