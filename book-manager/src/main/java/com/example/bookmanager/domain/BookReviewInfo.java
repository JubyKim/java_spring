package com.example.bookmanager.domain;

import com.example.bookmanager.domain.BaseEntity;
import com.example.bookmanager.domain.Book;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BookReviewInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    private Book book;

//    private Long bookId;

    private float averageReviewScore;

    private int reviewCount;
}
