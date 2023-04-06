package com.michellerodrigues.booksstoremanager.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.michellerodrigues.booksstoremanager.dto.AuthorDTO;
import com.michellerodrigues.booksstoremanager.dto.BookDTO;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data

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
    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publisherName;

    public Book(BookDTO bookDTO){
        //this.author = bookDTO.getAuthor();
        this.name = bookDTO.getName();
        this.pages = bookDTO.getPages();
        this.chapters = bookDTO.getChapters();
        this.isbn = bookDTO.getIsbn();
        this.publisherName = bookDTO.getPublisherName();
    }

    /*@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE} )
    @JoinColumn(nullable = false, name = "author_id")
    private @Valid @NotNull AuthorDTO author;*/
}
