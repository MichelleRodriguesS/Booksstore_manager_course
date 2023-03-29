package com.michellerodrigues.booksstoremanager.service;


import com.michellerodrigues.booksstoremanager.dto.BookDTO;
import com.michellerodrigues.booksstoremanager.dto.MessageResponseDTO;
import com.michellerodrigues.booksstoremanager.entity.Book;
import com.michellerodrigues.booksstoremanager.mapper.BookMapper;
import com.michellerodrigues.booksstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    private BookRepository bookRepository;
    private final BookMapper bookMapper = BookMapper.INSTANCE;


    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        // data transfer object
        return MessageResponseDTO.builder().message("Book created with ID:  " + savedBook.getId()).build();

    }


}
