package com.michellerodrigues.booksstoremanager.mapper;

import com.michellerodrigues.booksstoremanager.dto.BookDTO;
import com.michellerodrigues.booksstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);

}
