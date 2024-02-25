package com.bookshop.catalogservice.models;

public record Book(
        String isbn,
        String title,
        String author,
        Double price) {
}
