package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductTest2 {

	public static void main(String[] args) {
		LinkedList<Product2> list = new LinkedList<>(); 
		//Product2[] productList = new Product2[4];         // 배열 객채로 생성해서 addall로 넣어서 깔끔하게 정리하기
		list.add(new Product2("p100","TV",20000));         //매개변수이름은 소문자로 시작해야함!!!!!
		list.add(new Product2("p200","Computer",10000));
		list.add(new Product2("p100","MP3",700));
		list.add(new Product2("p300","Audio",1000));
		
		 System.out.println("제품 ID\t\t"+"제품명\t\t"+"가격");
		 System.out.println("-".repeat(50));     //repeat()? 알아보기
		 
		 //Collections.addall();            // 배열 객체를 여기 안에다가 넣음
		 Collections.sort(list);                          
		 Collections.reverse(list);          //내림차순을 하기위해선 오름차순으로 한번 값을 주고 시작
		 for(Product2 elem : list) {        // 대체 인터페이스(도우미 객체) Iterator 자바의 컬렉션(Collection)에 저장되어 있는 요소들을 순회하는 인터페이스이다.
			 System.out.println(elem);
		 }
	}

  }
   

