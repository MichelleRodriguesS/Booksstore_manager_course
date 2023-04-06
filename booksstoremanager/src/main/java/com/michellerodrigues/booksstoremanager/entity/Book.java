package com.michellerodrigues.booksstoremanager.entity;

import com.michellerodrigues.booksstoremanager.dto.BookDTO;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private Integer pages;
    @Column(nullable = false)
    private Integer chapters;
    @Column(nullable = false)
    private String isbn;

    private String publisherName;
    public Book(BookDTO bookDTO){
        //this.author = bookDTO.getAuthor();
        this.name = bookDTO.getName();
        this.pages = bookDTO.getPages();
        this.chapters = bookDTO.getChapters();
        this.isbn = bookDTO.getIsbn();
        this.publisherName = bookDTO.getPublisherName();
}

