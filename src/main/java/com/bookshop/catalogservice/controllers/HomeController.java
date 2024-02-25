package com.bookshop.catalogservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.catalogservice.config.BookshopProperties;

@RestController
public class HomeController {
    private final BookshopProperties bookshopProperties;

    public HomeController(BookshopProperties bookshopProperties) {
        this.bookshopProperties = bookshopProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        return bookshopProperties.getGreeting();
    }

}
