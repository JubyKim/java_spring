package com.example.bookmanager.repository;

import com.example.bookmanager.domain.Gender;
import com.example.bookmanager.domain.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
@Transactional //getOne쓰려면 이거 필요함.
class UserInfoRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserHistoryRepository userHistoryRepository;


    @Test
    void crud() {
        /* 
        System.out.println(">>> make new user!!!!!!");
        userRepository.save(new UserInfo());
        System.out.println(">>> this is user!!!!!! start");
        userRepository.findAll().forEach(it -> System.out.println(it));
        System.out.println(">>> this is user!!!!!! end");
        */
        
        //정렬 (Sort.by(Sort.Direction.DESC,"name")) | 전체조회 findAll
//        List<UserInfo> users = userRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));

        //여러 row 한번에 가져오기. ( findAllById) 
//        List<UserInfo> users = userRepository.findAllById(Lists.newArrayList(1L, 3L,5L));
//        System.out.println(">>> this is user!!!!");
//        users.stream().forEach(it -> System.out.println(it));


        /* 여러개 한번에 input : saveAll
        UserInfo user1 = new UserInfo("jack", "jack@naver.com");
        UserInfo user2 = new UserInfo("steve", "steve@naver.com");
        userRepository.saveAll(Lists.newArrayList(user1, user2));
        List<UserInfo> users = userRepository.findAll();
        System.out.println(">>> this is user!!!!");
        users.stream().forEach(it -> System.out.println(it));
*/

        /* getOne : proxy사용, Transactional 잇어야 print까지 유지하고 있을 수 있음
        UserInfo user = userRepository.getOne(1l);
        System.out.println(user);
        */
        /*
        userRepository.save(new UserInfo("newJuby","newJuby@slowcampus.com"));
        userRepository.flush(); // DB반영 시점 조정.

        //userRepository.saveAndFlush(new UserInfo("newJuby","newJuby@slowcampus.com"));

        List<UserInfo> users = userRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));
        users.stream().forEach(it -> System.out.println(it));
        */

//        long count = userRepository.count();
//        boolean exists = userRepository.existsById(1l); //exist여부를 판명함.
//        System.out.println(exists);
        //delete는 inbatch로 처리하는 것이 좋음. => select문을 수행하지 않기 때문

        /* paging 처리
        Page<UserInfo> users = userRepository.findAll(PageRequest.of(1,3));

        System.out.println("page : " + users);
        System.out.println("totalElements : " + users.getTotalElements());
        System.out.println("totalPage : " + users.getTotalPages());
        System.out.println("totalsize : " + users.getSize());
        System.out.println("sort : " + users.getSort());
        System.out.println("--------contents-----------");
        users.getContent().forEach(System.out::println);
*/
        //구글링이 필요할 시 ,query by Example
        ExampleMatcher matcher = ExampleMatcher.matching() .withIgnorePaths("name")
                .withMatcher("email", endsWith());

        Example<UserInfo> example = Example.of(new UserInfo("ma","fastcampus.com"), matcher);
        userRepository.findAll(example).forEach(System.out::println);

    }

    @Test
    void enumTest() {
        UserInfo user = userRepository.findById(1l).orElseThrow(RuntimeException::new);
        user.setGender(Gender.MALE);
        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);
    }

    @Test
    void userHistoryTest() {
        System.out.println("what is user repo first: ");
        userRepository.findAll().forEach(System.out::println);

        UserInfo user = new UserInfo();
        user.setEmail("martin-new@fastcampus.com");
        user.setName("martin-new");

        userRepository.save(user);

        user.setName("martin-new-new");

        userRepository.save(user);

        System.out.println("what is user repo: ");
        userRepository.findAll().forEach(System.out::println);

        System.out.println("여기에 결과 나옴 짜잔");
        userHistoryRepository.findAll().forEach(System.out::println);

    }
}