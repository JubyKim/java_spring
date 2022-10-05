package com.example.bookmanager.repository;

import com.example.bookmanager.domain.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
    Set<UserInfo> findByName(String name);
    Set<UserInfo> findUserByNameIs(String name);
    Set<UserInfo> findUserByName(String name);
    Set<UserInfo> findUserByNameEquals(String name);

    UserInfo findByEmail(String email);

    UserInfo getByEmail(String email);

    UserInfo readByEmail(String email);

    UserInfo queryByEmail(String email);

    UserInfo searchByEmail(String email);

    UserInfo streamByEmail(String email);

    UserInfo findUserByEmail(String email);

    UserInfo findSomethingByEmail(String email);

    List<UserInfo> findFirst2ByName(String name);

    List<UserInfo> findTop2ByName(String name);

    List<UserInfo> findLast1ByName(String name);

    List<UserInfo> findByEmailAndName(String email, String name);

    List<UserInfo> findByEmailOrName(String email, String name);

//    List<User> findByCreatedAtAfter(LocalDateTime yesterday);

    List<UserInfo> findByIdAfter(Long id);

//    List<User> findByCreatedAtGreaterThan(LocalDateTime yesterday);
//
//    List<User> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);
//
//    List<User> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);

    List<UserInfo> findByIdBetween(Long id1, Long id2);

    List<UserInfo> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);

    List<UserInfo> findByIdIsNotNull();

//    List<User> findByAddressIsNotEmpty();   // name is not null and name != '' ??

    List<UserInfo> findByNameIn(List<String> names);

    List<UserInfo> findByNameStartingWith(String name);

    List<UserInfo> findByNameEndingWith(String name);

    List<UserInfo> findByNameContains(String name);

    List<UserInfo> findByNameLike(String name);

    List<UserInfo> findTop1ByName(String name);

    List<UserInfo> findTopByNameOrderByIdDesc(String name);

    List<UserInfo> findFirstByNameOrderByIdDescEmailAsc(String name);

    List<UserInfo> findFirstByName(String name, Sort sort);

    Page<UserInfo> findByName(String name, Pageable pageable);

//    @Query(value = "select * from user limit 1;", nativeQuery = true)
//    Map<String, Object> findRawRecord();
//
    @Query(value = "select * from user_info", nativeQuery = true)
    List<Map<String, Object>> findAllRawRecord();
}
