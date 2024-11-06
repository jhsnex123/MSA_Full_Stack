package jpaexam1.app;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HelloJPA1 {
    public static void main(String[] args) {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");        // ~~~ 팩토리가 들어가면 객체 생성을 도와주는 매니저
    	System.out.println("EntityManagerFactory 객체 : " + factory.getClass().getName());    	
        factory.close();
    }
}
