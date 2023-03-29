package com.michellerodrigues.booksstoremanager.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Builder;
import lombok.Data;
@Builder

@Data

@Entity



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

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE} )
    @JoinColumn(nullable = false, name = "author_id")
    private Author author;
}
