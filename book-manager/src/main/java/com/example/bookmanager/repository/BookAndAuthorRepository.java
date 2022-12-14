package com.example.bookmanager.repository;

import com.example.bookmanager.domain.listener.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}
