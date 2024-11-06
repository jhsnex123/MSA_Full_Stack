package com.example.springnews.controller;

import com.example.springnews.model.News;
import com.example.springnews.model.NewsForm;
import com.example.springnews.repository.NewsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Slf4j
@Controller
public class NewsController {

    @Autowired
    NewsRepository newsRepository;


    @GetMapping("/newsmain")
    public String newsmainAll(Model model) {
        ArrayList<News> newsEntityList = (ArrayList<News>) newsRepository.findAll(); //jpaRepository로 상속받아서 findAll 바로 생성
        model.addAttribute("newsList",newsEntityList);
        return "/newsmain";
    }

   @PostMapping("/newsmain/create")
    public String createNews(NewsForm form) {
        System.out.println(form.toString());
        News news = form.toEntity();
        log.info(news.toString());
        News saved = newsRepository.save(news);
        log.info(saved.toString());
        return "/newscreate";
    }


}
