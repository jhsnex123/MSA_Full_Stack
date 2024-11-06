package jpaexam1.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HelloJPA2 {
    public static void main(String[] args) {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        System.out.println("EntityManagerFactory 객체 : " + factory.getClass().getName());
        EntityManager em = factory.createEntityManager();   //jdbc에선 커넥션이라고 불리는데 jpa에선 EntityManager가 가장 중요한 api기능을 맡고있다.
        System.out.println("EntityManager 객체 : " + em.getClass().getName());
        em.close();
        factory.close();
    }
}
