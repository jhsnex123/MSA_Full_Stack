
package com.example.springjpaedu.repository;

import com.example.springjpaedu.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
//    1.전체 도서의 리스트를 리턴하는 메서드 (clear)
//    2.전달된 id 와 동일한 id 를 갖는 도서를 리턴하는 메서드(clear)
//    3.가격이 높은 순으로 도서 리스트를 리턴하는 메서드
      List<Book> findAllByOrderByPriceDesc();
//    4.전달된 가격 정보와 동일하거나 비싼 도서 리스트를 리턴하는 메서드
      List<Book> findByPriceGreaterThanEqual(int price);
//    5.전달된 분류 정보와 동일한 도서 리스트를 리턴하는 메서드
      List<Book> findByKind(String kind);
//    6.도서 제목이 전달된 아규먼트 값으로 시작하는 도서 리스트를 리턴하는 메서드
      List<Book> findByTitleStartingWith(String title);
//    7.전달된 2개의 아규먼트중 하나를 도서 제목에 포함하는 도서 리스트를 리턴하는 메서드
      List<Book> findBookByTitleContainingOrTitleContaining(String title1, String title2);
//    8.가격이 가장 싼 도서를 리턴하는 메서드
      List<Book> findFirstByOrderByPriceAsc();
//    9.전체 도서의 개수를 리턴하는 메서드
      long count();
//    10.전달된 분류 정보에 속하는 도서의 개수를 리턴하는 메서드
      long countByKind(String kind);
//    11.분류별 도서 가격의 평균을 리턴하는 메서드
      @Query("SELECT AVG(t.price) FROM Book t GROUP BY t.kind")
      List<Integer> findAveragePriceByKind();
}

