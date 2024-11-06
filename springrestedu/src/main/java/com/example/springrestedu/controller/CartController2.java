package com.example.springrestedu.controller;

import com.example.springrestedu.dto.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController    //컨트롤러 생성
@Slf4j             //로그찍기
public class CartController2 {

    @GetMapping("/cart2")
        public ProductDTO cart(@RequestParam("pid") String pid){
          ProductDTO dto = new ProductDTO();
          dto.setPid(pid);
          switch (pid){
              case "p001" :
                  dto.setImgName("1.jpg");
                  break;
              case "p002":
                  dto.setImgName("2.jpg");
                  break;
              case "p003":
                  dto.setImgName("3.jpg");
                  break;
              case "p004":
                  dto.setImgName("4.jpg");
                  break;
              case "p005":
                  dto.setImgName("5.jpg");
                  break;
              case "p006":
                  dto.setImgName("6.jpg");
                  break;
              case "p007":
                  dto.setImgName("7.jpg");
                  break;
              case "p008":
                  dto.setImgName("8.jpg");
                  break;
              case "p009":
                  dto.setImgName("9.jpg");
                  break;

              default:
                  dto.setImgName("10.jpg");
                  break;
          }

          String time = String.format("%1$tm월 %1$td일 %1$tH시 %1$tM분", LocalDateTime.now());
          log.info(time+"에 " +pid+ " 상품이 선택되었습니다.");
          return dto;



        /*LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM월 dd일 HH시 mm분");
        String formatTime = now.format(dateTimeFormatter);          //String time = String.format("%tb %1$te일 %1$tk시 %1$tM분", LocalDateTime.now());

        *//*log.info(formatTime+"에 "+pid+" 상품이 선택되었습니다.");*//* // log를 쓸땐 꼭 변수값을 저장을 하고 괄호안에 넣는다.
        log.info("{} 에 {} 상품이 선택되었습니다.",formatTime,pid);

        return "컨트롤러의 답변 : "+pid+" 상품을 선택했네요...";*/
    }

}

