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

    @Autowired
    private BookRepository bookRepository;
    private final BookMapper bookMapper = BookMapper.INSTANCE;




    
    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);

        return MessageResponseDTO.builder().message("Book created with ID:  " + savedBook.getId()).build();


    }


}
