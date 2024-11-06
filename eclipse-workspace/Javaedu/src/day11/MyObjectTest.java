package day11;            //object ->조상클래스

class MyObject {  // 부모클래스
	
}
class MyObject2 { //자식클래스
	@Override
	 public String toString() {
		return "MyObject2 클래스의 객체임!!";
	}
}
	 class MyObject3 { //오버라이딩(현재진행)  @->어노테이션
     @Override
		public String toString() {
			return super.toString() + "-----MyObject3 클래스의 객체임!!";  //super -- this 둘이 역활 비슷한데 super는 조상 클래스껄 불러다 쓰는거
		}
}
public class MyObjectTest {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		System.out.println(obj.toString());
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		MyObject2 obj2 = new MyObject2();
		System.out.println(obj2.toString());
		System.out.println("-".repeat(30));
		System.out.println(obj);
		System.out.println(d);
		System.out.println(obj2);
		System.out.println("-".repeat(30));
		System.out.println("결과 1" + obj);
		System.out.println("결과 2" + d);
		System.out.println("결과 3" + obj2);
		System.out.println("-".repeat(30));
		System.out.println("결과 :" + new MyObject3());
	}
}
