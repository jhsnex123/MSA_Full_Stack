package jpaexam1.app;

import jpaexam1.entity.Member;

import jakarta.persistence.*;
import java.util.Scanner;

public class MemberTeamTest3 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("회원명을 입력하세요 : ");
        String inputName = scan.nextLine();
        scan.close();
        
        String jpql = "select m from Member m where m.username = :mn";
        TypedQuery<Member> q = em.createQuery(jpql, Member.class);
        q.setParameter("mn", inputName);
        Member dto;
        try {
            dto = q.getSingleResult(); //정확하게 하나만 추출해야함
            System.out.printf("%s님은 %s팀 소속이고 %s 락커를 사용중입니다.%n", dto.getUsername(), dto.getTeam().getName(), dto.getLocker().getName()); // 자바는 프라이빗형 객체를 가져올때는 무조건 getter 메서드 써야함
        } catch(NoResultException e) {      //
        	System.out.printf("%s님은 정보가 없습니다.%n", inputName);
        }
        em.close();
        factory.close();
	}
}
