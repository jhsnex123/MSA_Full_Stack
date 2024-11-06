package day17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person {               // 객체 클라스
	private String name;               // 프라이빗형 멤버변수                
	private int age;

	public Person(String name, int age) {       // 멤버변수를 쓰기 위해 생성자 메서드 만듬
		this.name = name;                 // 이름은 고유명사 바뀌면 안됨
		this.age = age;
	}

	@Override                // 명시 해놓으면 좋음(@override) 오버라이딩은 같은 메서드 재정의하는 의미
	public String toString() {		         // toString 은 오브젝트의 자식
		return name+"("+age+")";
	}	
	
	public int getAge() {        
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class CollectionSort {
	public static void main(String[] args) {
		List<Person> list = new LinkedList<>();  //링크드 메서드 객체생성
		Random rand = new Random();  // 여기서 랜덤은 나이값
		for(int i=1; i <= 10; i++) {
			list.add(new Person("duke"+i, rand.nextInt(30)));
		}

		System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);
//		Collections.reverse(list);
//		System.out.println("\nlist의 데이터들을 내림차순으로 소팅한 결과 : " + list);			
	}
}




