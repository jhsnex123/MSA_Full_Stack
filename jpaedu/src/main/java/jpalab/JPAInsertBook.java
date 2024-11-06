package jpalab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpalab.entity.Book;


import java.util.Scanner;

public class JPAInsertBook {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        Book bk1;
        Book bk2;
        Book bk3;
        Book bk4;
        em.getTransaction().begin();


            bk1 = new Book();
            bk1.setKind("b01");
            bk1.setPrice(10000);
            bk1.setTitle("이것이 자바다");
            em.persist(bk1);

            bk2 = new Book();
            bk2.setKind("b02");
            bk2.setPrice(19800);
            bk2.setTitle("모던 자바스크립트 핵심 가이드");
            em.persist(bk2);

            bk3= new Book();
            bk3.setKind("b03");
            bk3.setPrice(28000);
            bk3.setTitle("그림과 실습으로 배우는 도커 & 쿠버네티스");
            em.persist(bk3);

            bk4= new Book();
            bk4.setKind("b04");
            bk4.setPrice(27000);
            bk4.setTitle("MySQL로 배우는 데이터베이스 개론과 실습");
            em.persist(bk4);   // remove는 삭제 persist는 새로운 객체를 가져옴

        System.out.println("엔터키.....");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        scan.close();
        em.getTransaction().commit();  // 이때 플러시가 플러시 호출     기본은 razy방식임
        em.close();                    // 플러시가 되면 db서버로 호출
        factory.close();                 // remove도 lazy방식
    }
}
