
package com.example.library.management.repository;

import com.example.library.management.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository
        extends JpaRepository<Book, Long> {
}
