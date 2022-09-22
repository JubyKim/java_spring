package com.example.bookmanager.domain;

import com.example.bookmanager.domain.listener.Auditable;
import lombok.*;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true)
//@EqualsAndHashCode(callSuper = true)
//@DynamicUpdate
//@Where(clause = "deleted = false")
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String category;

    private Long authorId;

    private Long publisherId;

    @OneToOne(mappedBy = "book")
    @ToString.Exclude
    private BookReviewInfo bookReviewInfo;
//
//    @OneToMany
//    @JoinColumn(name = "book_id")
//    @ToString.Exclude
//    private List<Review> reviews = new ArrayList<>();
//
//    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
//    @ToString.Exclude
//    private Publisher publisher;
//
//    //    @ManyToMany
//    @OneToMany
//    @JoinColumn(name = "book_id")
//    @ToString.Exclude
//    private List<BookAndAuthor> bookAndAuthors = new ArrayList<>();
//
//    private boolean deleted;
//
//    //    @Convert(converter = BookStatusConverter.class)
//    private BookStatus status; // 판매상태
//
//    public void addBookAndAuthors(BookAndAuthor... bookAndAuthors) {
//        Collections.addAll(this.bookAndAuthors, bookAndAuthors);
//    }
}
