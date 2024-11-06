package com.example.springrestedu;

import com.example.springrestedu.entity.Friend;
import com.example.springrestedu.repository.FriendRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FriendRepositoryTest {

    @Autowired
    private FriendRepository friR;

    @BeforeEach
    void pr() { System.out.println("======================================="); }


    @Test
    @Transactional
    void create1(){
    System.out.println("INSERT 메서드 진입");
        Friend friend = new Friend();
        System.out.println("friend");
        friend.setFname("홍길동");
        friend.setFage(1000);
        friR.save(friend);
    }
    @Test
    @Transactional
    void create2(){
        System.out.println("INSERT 메서드 진입");
        Friend friend = new Friend();
        System.out.println("friend");
        friend.setFname("각시탈");
        friend.setFage(200);
        friR.save(friend);
    }

    @Test
    @Transactional
    void create3(){
        System.out.println("INSERT 메서드 진입");
        Friend friend = new Friend();
        System.out.println("friend");
        friend.setFname("이순신");
        friend.setFage(500);
        friR.save(friend);
    }
    @Test
    @Transactional
    void friendFindAll(){
        System.out.println("친구의 전체 리스트 데이터 진입");
        List<Friend> list= friR.findAll();
        list.stream().forEach(System.out::println);

}
    @Test
    @Transactional
    void friendFindById(){
        System.out.println("전달받은 id값으로 해당 친구 데이터 json 형식");
        Friend entity = friR.findById(1).get();
        System.out.println(entity);

    }


}
