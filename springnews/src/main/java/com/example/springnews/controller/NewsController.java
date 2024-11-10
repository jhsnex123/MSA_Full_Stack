package com.example.springnews.controller;

import com.example.springnews.model.News;
import com.example.springnews.model.NewsForm;
import jakarta.validation.Valid;
import com.example.springnews.repository.NewsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/newsmain")
public class NewsController {

    @Autowired
    NewsRepository newsRepository;


    @GetMapping()
    public String newsmainAll(Model model) {
       List<News> newsEntityList = newsRepository.findAll(); //jpaRepository로 상속받아서 findAll 바로 생성
        model.addAttribute("newsList",newsEntityList);
        return "newsmain";
    }

    // `GET` 요청을 처리하는 매핑 메서드
    @GetMapping("/create")
    public String showCreatePage(Model model) {
        model.addAttribute("news",new News()); //News 객체를 모델에 추가
        return "newscreate"; // newscreate.html 파일을 반환
    }
    // `POST` 요청을 처리하는 매핑 메서드
    @PostMapping("/create")
    public String createNews(@ModelAttribute("news") News news, BindingResult bindingResult,Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("news", news);
            return "create";
        }

/*      // 1. dto를 엔티티로 변환
        News news = form.toEntity();
        log.info(news.toString());*/

        // 2. 리파지터리로 엔티티를 DB에 저장
        News saved = newsRepository.save(news);
        log.info(saved.toString());
        return "redirect:/newsmain" + saved.getId(); // 저장 후 메인 페이지로 리디렉션
    }



}
