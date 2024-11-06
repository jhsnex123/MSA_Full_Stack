package day15;

import java.util.HashSet;
import java.util.Objects;

class Member3 {
	private int id;
	private String name;
	private String password;

	Member3(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String toString() {
		return "(" + id + ":" + name + ":" + password + ")";
	}

	@Override
	public int hashCode() { //(ex.회원정보 (jhhnex123(id) , jhsnex123(id) 둘이 다르면 코드가 다름)
		return Objects.hash(id, name, password); // 공용 정보공간?  object에 s(복수형, 수일치) 를 붙으면 도우미 클래스 
	}                         //hash()메서드는 해쉬코드값이 맞는지 구분하는 메서드

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Member3) {
			Member3 m = (Member3) o;
			if (id == m.id && name.equals(m.name) && password.equals(m.password))
				return true;
		}
		return false;
	}	
}

public class ObjectTest3 {
	public static void main(String args[]) {
		Member3 obj1 = new Member3(10, "자바", "duke");
		Member3 obj2 = new Member3(10, "자바", "duke");
		Member3 obj3 = new Member3(20, "자바", "duke");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());           
		
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj2.equals(obj3));
//		System.out.println(obj2.equals(obj3)); 
		
		HashSet<Member3> set = new HashSet<>();  // hash set으로 먼저보고 구분 안되면 equlas 로 가서 true면 같은거임
		System.out.println(set.add(obj1)); //1 2 같음
		System.out.println(set.add(obj2)); //1 2 같음
		System.out.println(set.add(obj3)); // 애는 다름
		System.out.println("저장된 데이터의 갯수 : " + set.size());
		System.out.println(set);
	}
}
