package com.example.bookmanager.repository;

import com.example.bookmanager.domain.Book;
import com.example.bookmanager.domain.BookReviewInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;


    @Autowired
    private BookReviewInfoRepository bookReviewInfoRepository;


    @Test
    void bookTest () {
        Book book = new Book();
        book.setTitle("초격차 패키지");
        book.setAuthorId(1l);
        book.setPublisherId(1l);
        bookRepository.save(book);

        System.out.println(">>>> here test result");
        System.out.println(bookRepository.findAll());
        System.out.println(">>>> here test result");
    }

    @Test
    void crud(){
        BookReviewInfo bookReviewInfo = new BookReviewInfo();

//        bookReviewInfo.setBookId(1l);
        bookReviewInfo.setAverageReviewScore(4.5f);
        bookReviewInfo.setReviewCount(2);

        bookReviewInfoRepository.save(bookReviewInfo);
        System.out.println("herererererer");
        bookReviewInfoRepository.findAll().forEach(System.out::println);
    }

}
