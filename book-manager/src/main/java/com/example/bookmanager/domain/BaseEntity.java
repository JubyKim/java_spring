package com.example.bookmanager.domain;

import com.example.bookmanager.domain.listener.Auditable;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

import static java.time.LocalTime.now;

@Data
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public class BaseEntity implements Auditable {
    @CreatedDate
//    @ColumnDefault("now(6)")
    @Column(columnDefinition = "datetime(6) default now(6) comment '생성시간'", nullable = true, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
//    @ColumnDefault("now(6)")
    @Column(columnDefinition = "datetime(6) default now(6) comment '수정시간'", nullable = true)
    private LocalDateTime updatedAt;
}
