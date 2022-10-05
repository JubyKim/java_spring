package com.example.bookmanager.domain;

import org.junit.jupiter.api.Test;

class UserInfoTest {
    @Test
    void test() {
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail("martin@fastcampus.com");
        userInfo.setName("martin");
//        user.setCreatedAt(LocalDateTime.now());
//        user.setUpdatedAt(LocalDateTime.now());

//        UserInfo userInfo1 = new UserInfo(null, "martin", "martin@fastcampus.com");
//        User user2 = new User("martin", "martin@fastcampus.com");

        UserInfo userInfo3 = UserInfo.builder()
                .name("martin")
                .email("martin@slowcampus.com")
                .build();

        System.out.println(">>> " + userInfo.toString());
        System.out.println(">>> " + userInfo3.toString());
    }

}