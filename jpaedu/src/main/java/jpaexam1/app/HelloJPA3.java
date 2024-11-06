package jpaexam1.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import jpaexam2.model.entity.Emp;

public class HelloJPA3 {
    public static void main(String[] args) {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();   // em: 영속성 컨텍스트

        Query q = em.createQuery("select t from Emp t", Emp.class);   // JPQL은 철처하게 엔티티 클래스 틀을 맞춰서 쓴다 // SQL보단 최대한 자바스럽게 작성해야함(쿼리문)
        List<Emp> empList = q.getResultList();     // getResultList(); JPQL의 여러개의 행을 추출할 때 쓰는 객체 , 하나만 쓰고 싶으면 getsingleResultList(); single을 붙여야함
        for (Emp elem : empList) {
            System.out.println(elem.getEname());
        }
        System.out.println("데이터 갯수 : " + empList.size());
        em.close();
        factory.close();
    }
}
