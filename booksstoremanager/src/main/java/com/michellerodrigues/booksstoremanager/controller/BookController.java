package com.michellerodrigues.booksstoremanager.controller;

import com.michellerodrigues.booksstoremanager.dto.BookDTO;
import com.michellerodrigues.booksstoremanager.dto.MessageResponseDTO;
import com.michellerodrigues.booksstoremanager.entity.Book;
import com.michellerodrigues.booksstoremanager.repository.BookRepository;
import com.michellerodrigues.booksstoremanager.service.BookService;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")


public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
        return bookService.create(bookDTO);

    }


}
