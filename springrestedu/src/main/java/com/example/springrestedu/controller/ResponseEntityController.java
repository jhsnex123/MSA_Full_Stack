package com.example.springrestedu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springrestedu.dto.Message;
import com.example.springrestedu.dto.MemberDTO;

@RestController
public class ResponseEntityController {
    @GetMapping("/test1")
    public ResponseEntity<String> work1(){
        return new ResponseEntity<>("*success*", HttpStatus.OK);
    }
    @GetMapping(value="/test2")
    public ResponseEntity<Message> work2(){
        Message message = Message.builder()
                .msg1("둘리")
                .msg2("또치")
                .msg3("도우너")
                .build();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @GetMapping(value="/test3")
    public ResponseEntity work3(){
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR); // 500.사망
    }
    @GetMapping(value="/test4")
    public ResponseEntity work4(){
        return new ResponseEntity("오류났슈!!", HttpStatus.INTERNAL_SERVER_ERROR); // 오류가 나도 body내용을 기입해주면 화면에 출력 가능
    }
    @GetMapping("/test5")
    public ResponseEntity work5(){
        return new ResponseEntity(HttpStatus.OK);// 스테이터스 값이 200이고 body값이 없으면 화면에 아무것도 안나옴
    }

    @GetMapping("/test6")
    public ResponseEntity work6(){
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("AUTHCODE","xxxxxxx"); //
        header.add("TOKEN", "yyyyyyy");    // 토큰은 응답해더 안에다가 넣어서 줘야한다.
        return new ResponseEntity(header, HttpStatus.OK); // 그 담에 인증처리를 걸쳐서 출력
    }
    @GetMapping("/test7")
    public ResponseEntity<MemberDTO> work7(){
        MemberDTO dto = new MemberDTO();
        dto.setName("유니코");                 // 빌더패턴
        dto.setEmail("unico@naver.com");      // 빌더패턴
        dto.setPhone("010-3333-4444");        // 빌더패턴
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dto);
    }
}
