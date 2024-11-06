package day15;

import java.util.HashSet;
class Member2 {
	private int id;
	private String name;
	private String password;

	Member2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public boolean equals(Object o) {  //매개변수 o가 오브젝트 객체값으로 받고
		if (this == o)             // 오브젝트니깐 this 가능
			return true;            // true니깐 리턴 this( 값이 equals로 들어감
		if (o != null && o instanceof Member2) {     // o(this) , instanceof로 o(this)하고 멤버2(this) 비교했을떄 같은 값이니 true 
			Member2 m = (Member2) o;        //         o(this)에서 m으로 대입
			if (id == m.id && name.equals(m.name) && password.equals(m.password))      //id(this) m(this) 둘이 같음
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member2 [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
public class ObjectTest2 {
	public static void main(String args[]) {
		Member2 obj1 = new Member2(10, "자바", "duke");
		Member2 obj2 = new Member2(10, "자바", "duke");
		Member2 obj3 = new Member2(20, "자바", "duke"); // 20 (id) 여서 obj1이랑 id값이 달라서 false
		
		System.out.println(obj1.equals(obj1));  // t
		System.out.println(obj1.equals(obj2));  // t
		System.out.println(obj1 == obj2); // f
		System.out.println(obj1.equals(null)); //f
		System.out.println(obj1.equals(new java.util.Date())); //f
		System.out.println(obj1.equals(obj3)); // f
		
		HashSet<Member2> set = new HashSet<>();          // 
		System.out.println(set.add(obj1));
		System.out.println(set.add(obj2));
		System.out.println(set.add(obj3));
		System.out.println(set);
	}
}





