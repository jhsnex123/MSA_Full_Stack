package com.example.springrestedu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController    //컨트롤러 생성
@Slf4j             //로그찍기
public class CartController1 {

    @GetMapping("/cart1")
        public String cart(@RequestParam("pid") String pid){        //public은 접근 제한자, String은 반환값(return), cart는 매개변수 @
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM월 dd일 HH시 mm분");
        String formatTime = now.format(dateTimeFormatter);          //String time = String.format("%tb %1$te일 %1$tk시 %1$tM분", LocalDateTime.now());

        /*log.info(formatTime+"에 "+pid+" 상품이 선택되었습니다.");*/ // log를 쓸땐 꼭 변수값을 저장을 하고 괄호안에 넣는다.
        log.info("{} 에 {} 상품이 선택되었습니다.",formatTime,pid);

        return "컨트롤러의 답변 : "+pid+" 상품을 선택했네요...";
    }

}

