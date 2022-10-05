package com.example.bookmanager.repository;

import com.example.bookmanager.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootTest
//@SpringBootApplication
@Transactional //getOne쓰려면 이거 필요함.
public class EntityManagerTest {

    @Autowired
    EntityManager entityManager;


    @Autowired
    UserRepository userRepository;


    @Test
    void entityManagerTest() {
        System.out.println(entityManager.createQuery("select u from UserInfo u" ).getResultList());
    }

    @Test
    void cacheFindTest() {
        System.out.println(userRepository.findById(1L).get());
        System.out.println(userRepository.findById(1L).get());
        System.out.println(userRepository.findById(1L).get());
    }

    void cacheFindTest2() {
        System.out.println(userRepository.findById(1L).get());
        System.out.println(userRepository.findById(1L).get());
        System.out.println(userRepository.findById(1L).get());
    }
}


