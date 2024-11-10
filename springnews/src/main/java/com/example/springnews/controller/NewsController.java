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
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
            return "/newsmain/create";
        }

/*      // 1. dto를 엔티티로 변환
        News news = form.toEntity();
        log.info(news.toString());*/

        // 2. 리파지터리로 엔티티를 DB에 저장
        News saved = newsRepository.save(news);
        log.info(saved.toString());
        return "redirect:/newsmain";
        //return "redirect:/newsmain" + saved.getId(); // 저장 후 메인 페이지로 리디렉션
    }

@GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        // 수정할 데이터 가져오기
        News news = newsRepository.findById(id);
        news.setCnt(news.getCnt() + 1);
        newsRepository.save(news);


        // 모델에 데이터 등록하기
        model.addAttribute("news", news);

        //뷰 페이지 설정하기
        return "newsedit";
}

@PostMapping("/update")
    public String update(@Valid NewsForm newsForm, BindingResult bindingResult, Model model) {
    log.info("입력 폼 값"+newsForm.toString());

    // 1. DTO를 엔티티로 변환하기
    News newsEntity = newsForm.toEntity();
    log.info("Entity 변환 값"+newsEntity.toString());

    // 2. 엔티티를 DB로 저장하기
    // 2-1. DB에서 기존 데이터 가져오기
    News target = newsRepository.findById(newsEntity.getId());

    // 2-2. 기존 데이터 값을 갱신하기
    if (target != null) {
        newsRepository.save(newsEntity);
        // 데이터 갱신
        target.setTitle(newsEntity.getTitle());
        target.setContent(newsEntity.getContent());
        target.setWriter(newsEntity.getWriter());
        // writedate나 cnt는 보통 수정 시 변경하지 않는다.

        newsRepository.save(target);
        //return "redirect:/newsmain/" + target.getId();
        return "redirect:/newsmain";
    } else {
        return "redirect:/newsmain";
    }

    }

    @DeleteMapping("/delete")
    public String delete (@Valid NewsForm newsForm, BindingResult bindingResult, Model model){
        // newsedit 삭제 버튼
        // id 받아오기
        // 찾아서 고놈 삭제
        return "newsmain";
    }
}
