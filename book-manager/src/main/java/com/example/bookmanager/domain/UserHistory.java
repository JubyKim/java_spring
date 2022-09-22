package com.example.bookmanager.domain;

import com.example.bookmanager.domain.listener.MyEntityListener;
import com.example.bookmanager.domain.listener.UserEntityListener;
import com.example.bookmanager.repository.UserHistoryRepository;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@EnableJpaAuditing
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@EntityListeners(value = { MyEntityListener.class})
public class UserHistory  extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long userID;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private Gender gender;

    @CreatedDate
//    @CreationTimestamp
    private LocalDateTime createdAt;

    @LastModifiedDate
//    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @ToString.Exclude
    private UserInfo user;
}
