package com.example.bookmanager.domain.listener;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class MyEntityListener {

    @PrePersist
    public void prePersist(Object object) {
        if (object instanceof Auditable) {
            ((Auditable) object).setCreatedAt(LocalDateTime.now());
            ((Auditable) object).setUpdatedAt(LocalDateTime.now());
        }
    }

    @PreUpdate
    public void preUpdate(Object object) {
        ((Auditable) object).setUpdatedAt(LocalDateTime.now());
    }


}
