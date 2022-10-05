package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {

        System.out.println("hello");

        var objectMapper = new ObjectMapper();

        //objetct to text
        //object mapper가 get method를 활용함.
        //내가 생성한 object를 object mapper에서도 활용할 시에는 함수 생성시 get을 사용하지 않도록 해야함.
        var user = new User("Juby", 12, "010-1111-2222");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);


        //text to object
        //text -> object에는 default 생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }

}
