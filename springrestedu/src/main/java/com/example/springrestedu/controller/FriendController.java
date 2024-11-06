package com.example.springrestedu.controller;


import com.example.springrestedu.entity.Friend;
import com.example.springrestedu.repository.FriendRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/friends")
public class FriendController {

    @Autowired
    private FriendRepository friendRepository;

    //@GetMapping
    public void initDB() {
        Friend friend1 = new Friend();
        friend1.setFage(30);
        friend1.setFname("나그네");
        friendRepository.save(friend1);
        System.out.println("나그네넣기");

        Friend friend2 = new Friend();
        friend2.setFage(40);
        friend2.setFname("멍뭉이");
        friendRepository.save(friend2);
        System.out.println("멍뭉이넣기");

        Friend friend3 = new Friend();
        friend3.setFage(50);
        friend3.setFname("고영희");
        friendRepository.save(friend3);
        System.out.println("츄르");
    }

    @GetMapping
    public ResponseEntity<List<Friend>> list() {
        log.info("list요청");
        return new ResponseEntity<>(friendRepository.findAll(), HttpStatus.OK);
        //select * from friend;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Friend> read(@PathVariable("id") int id) {        //ResponseEntity<오브젝트> 이거 대신 오브젝트로 줄수 있음
        log.info("read 요청");
        System.out.println("전달받은 id값으로 해당 친구 데이터 json 형식");
        Friend entity = friendRepository.findById(id).get();
        System.out.println(entity);

        ResponseEntity<Friend> entity1 = new ResponseEntity<>(entity, HttpStatus.OK);
        // select * from friend where id = id;
        return entity1;
    }

   /* @PostMapping
    public ResponseEntity<String> register(@R)*/

    @PutMapping("/{id}")
    public ResponseEntity<String> modify(@PathVariable("id") int id, @RequestBody Friend friend) {
        log.info("modify 요청");
        Friend friend1 = new Friend();
        friend1.setId(id);
        Friend entity = friendRepository.findById(id).get();
        ResponseEntity<String> entity1 = new ResponseEntity<>("성공적으로 수정했어용", HttpStatus.OK);

        return entity1;
    }

}

//
//        friend.setFname("홍길동");
//        friend.setFage(1000);
//        friendRe.save(friend);
//        log.info("friend");
//
/*

    public FriendController() {
        Friend friend1 = new Friend();
        friend1.setFname("홍길동");
        friend1.setFage(1000);
        friR.save(friend1);

        Friend friend2 = new Friend();
        friend2.setFname("각시탈");
        friend2.setFage(200);
        friR.save(friend2);

        Friend friend3 = new Friend();
        friend3.setFname("이순신");
        friend3.setFage(500);
        friR.save(friend3);
    }

*/

