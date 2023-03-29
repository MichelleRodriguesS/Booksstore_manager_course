package com.michellerodrigues.booksstoremanager.service;


import com.michellerodrigues.booksstoremanager.dto.BookDTO;
import com.michellerodrigues.booksstoremanager.dto.MessageResponseDTO;
import com.michellerodrigues.booksstoremanager.entity.Book;
import com.michellerodrigues.booksstoremanager.repository.BookRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = Book.builder().build();



        Book savedBook = bookRepository.save(bookToSave);
        // data transfer object
        return MessageResponseDTO.builder().message("Book created with ID:  " + savedBook.getId())
                .build();

    }


}
