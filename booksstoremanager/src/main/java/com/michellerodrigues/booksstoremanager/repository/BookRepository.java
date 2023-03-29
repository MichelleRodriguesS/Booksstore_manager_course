package com.michellerodrigues.booksstoremanager.repository;

import com.michellerodrigues.booksstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}
