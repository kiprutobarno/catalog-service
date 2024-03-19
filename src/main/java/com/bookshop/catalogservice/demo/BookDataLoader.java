package com.bookshop.catalogservice.demo;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.bookshop.catalogservice.models.Book;
import com.bookshop.catalogservice.repository.BookRepository;

@Component
@Profile("testdata")
public class BookDataLoader {
    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        bookRepository.deleteAll();
        var book1 = Book.of("1234567891", "Northern Lights",
                "Nikita Lovren", 8.50, "Reuters");
        var book2 = Book.of("1234567892", "Eternal Journey",
                "Andrew Johnson", 12.80, "Independent");
        bookRepository.saveAll(List.of(book1, book2));
    }
}
