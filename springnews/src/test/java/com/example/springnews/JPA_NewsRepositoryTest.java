
package com.example.springnews;


import com.example.springnews.model.News;
import com.example.springnews.repository.NewsRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
public class JPA_NewsRepositoryTest {

    @Autowired
    private NewsRepository newR;

    @BeforeEach
    void pr() {
        System.out.println("==========================================================");
    }

    @Test
    @Transactional
    @Rollback(false) // rollback이 기본임. DML 문 수행한 후에 rollback 하고싶지 않다면 사용

    void newsSave() {
        System.out.println("INSERT 메서드 진입");
        News news = new News();
        System.out.println("new");
        news.setWriter("라울");
        news.setTitle("레알마드리드");
        news.setContent("레알마드리드 공격수");
        newR.save(news);

    }
    @Transactional
    @Rollback(value = false)
    @Test
    void newsSave2() {
        System.out.println("INSERT 메서드 진입");
        News news = new News();
        System.out.println("new");
        news.setWriter("네이마르");
        news.setTitle("바르셀로나");
        news.setContent("바르셀로나 공격수");
        newR.save(news);

    }
    @Transactional
    @Rollback(value = false)
    @Test
    void newsSave3() {
        System.out.println("INSERT 메서드 진입");
        News news = new News();
        System.out.println("new");
        news.setWriter("에투");
        news.setTitle("바르셀로나");
        news.setContent("바르셀로나 공격수");
        newR.save(news);
    }

    void newsFindAll() {
        List<News> list = newR.findAll();
        list.stream().forEach(System.out::println);
    }
    @Test
    @Transactional
    @Rollback(value = false)
    void newsUpdate() {
        System.out.println("UPDATE 메서드 진입");
        News news = newR.findById(9);
        if(news == null) {
            System.out.println("수정할 게시글 없음");
            return; // 수정할 게시글이 없으면 메서드 종료
        }
        news.setContent("레알마드리드 공격수");
        news.setTitle("레알마드리드");
        news.setWriter("이스코");
        newR.save(news);
    }


    @Transactional
    @Rollback(value = false)
    @Test
    void newsDelete() {
        System.out.println("DELETE 메서드 진입");
        newR.deleteAll();
    }
}


