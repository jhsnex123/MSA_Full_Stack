
package com.example.springjpaedu;


import com.example.springjpaedu.entity.Book;
import com.example.springjpaedu.repository.BookRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
public class JPA_BookRepositoryTest {

    @Autowired
    private BookRepository bookR;

    @BeforeEach()
    void pr() {
        System.out.println("==========================================================");
    }

    @Test
    @Order(1)
    void findAll() {
        List<Book> list = bookR.findAll();
        list.stream().forEach(System.out::println);
    }

    @Test
    @Order(2)
    void findById() {
        Book entity = bookR.findById(1).get();
        Book entity1 = bookR.findById(2).get();
        Book entity2 = bookR.findById(3).get();
        Book entity3 = bookR.findById(4).get();
        System.out.println(entity);
        System.out.println(entity1);
        System.out.println(entity2);
        System.out.println(entity3);
    }

    @Test
    @Order(3)
    void findAllByOrderByPriceDesc() {
        List<Book> list = bookR.findAllByOrderByPriceDesc();
        list.stream().forEach(System.out::println);
    }

    @Test
    @Order(4)
    void findByPriceGreaterThanEqual() {
        List<Book> list = bookR.findByPriceGreaterThanEqual(20000);
        list.stream().forEach(System.out::println);
    }

    @Test
    @Order(5)
    void findBookByTitleContainingOrTitleContaining() {
        List<Book> list = bookR.findBookByTitleContainingOrTitleContaining("자바", "도커");
        list.stream().forEach(System.out::println);
    }

    @Test
    @Order(6)
    void findByTitleStartingWith() {
        List<Book> list = bookR.findByTitleStartingWith("모던");
        list.stream().forEach(System.out::println);
    }

    @Test
    @Order(7)
    void findCheapestBook() {
        List<Book> list = bookR.findFirstByOrderByPriceAsc();
//        list.stream().forEach(System.out::println);
        System.out.println(list);
    }

    @Test
    @Order(8)
    void findByKind() {
        List<Book> list = bookR.findByKind("b02");
        list.stream().forEach(System.out::println);
        System.out.println("b02 부류의 도서는" + list + "권");
    }

    @Test
    @Order(9)
    void bookcount() {
        Long book = bookR.count();
        System.out.println("전체 도서의 수 : " + book + "권");
    }

    @Test
    @Order(10)
    void countByKind() {
        Long book = bookR.countByKind("b02");
        System.out.println("b02 부류의 도서는 " + book + " 권");
    }

    @Test
    @Order(11)
    void findAveragePriceByKind() {
        List<Integer> list = bookR.findAveragePriceByKind();
        list.stream().forEach(System.out::println);
    }
}




