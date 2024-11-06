package jpalab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpalab.entity.Book;

public class JPASelectBook {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();     // SQL로 치면 CRUD작업을 알리는 매서드

        int rand = (int) (Math.random() * 5) + 1;

        long count = 0;      // COUNT 변수를 미리 초기화
        if (rand == 1) {
            em.createQuery("SELECT t FROM Book t", Book.class).getResultList()
                    .forEach(System.out::println);
        } else if (rand == 2) {
            em.createQuery("SELECT t FROM Book t ORDER BY t.price DESC", Book.class).getResultList()
                    .forEach(System.out::println);

        } else if (rand == 3) {
            em.createQuery("SELECT t FROM Book t WHERE t.price < 20000", String.class).getResultList()         //:price 동적 파라미터?
                    .forEach(System.out::println);
        } else if (rand == 4) {
            em.createQuery("SELECT t FROM Book t WHERE  t.title LIKE '%자바%'", Book.class).getResultList()
                    .forEach(System.out::println);
        } else if (rand == 5) {
            count = em.createQuery("SELECT COUNT(t) FROM Book.t", Long.class).getSingleResult();
        } else {
            System.out.println("도서는 모두" + count + "권 입니다,");
        }
        System.out.println("추출된 숫자 -------->"  + rand);
    }
}