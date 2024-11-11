package com.example.springnews.repository;

import com.example.springnews.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
public interface NewsRepository extends JpaRepository<News,Integer> {
    // 1.뉴스글 작성
       //SAVE 부모로 만들기
    // 2.뉴스글 전체 읽기
        // findall 부모로 만들기
    // 3.id 로 글 한 개 읽기
    public News findById(int id);


    // find id 부모로 만들기
    // 4.뉴스글 삭제와 변경 등과 관련된 메서드
       // delete all 부모,
    // 5.뉴스 글 내용에서 검색 기능이 필요하며 그리고 글 한 개를 읽은 경우에는 cnt 변경도 필요하다.

    // 이외에도 필요하다고 판단되는 쿼리 메서드 구현은 자율이다.
}
    // 6.검색 findbycontaing(like)

    //7.조회수 증가

    //8.작성자 클릭시 작성자가 작성한 글 불러오기

    //9.페이징 처리
