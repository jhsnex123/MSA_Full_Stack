package day11;       //java.lang.Object -<최상위 클래스 조상

class Parent {          // 부모 클래스 (조상한테 물려받음)
	int x = 1, y = 2;
}
class Child extends Parent {         //자식 클래스 (부모한테 물려받음)
	int x = 10;   //멤버변수
	void printInfo() {
		int x = 100;          //지역변수
		System.out.println(x);				// 	     100
		System.out.println(this.x);		//  	 10
		System.out.println(super.x);		// 	      1
		System.out.println(y);				//  	  2
		System.out.println(this.y);		// 	      2
		System.out.println(super.y);		//   	  2
		//System.out.println(z);
	}
	public String toString() {
		return "Child 클래스의 객체임~~~";
	}
}
public class ParentChildTest {
	public static void main(String[] args) {		
		new Child().printInfo();    // 왼쪽 참조값이 없음 그래서 1회성(.printlnfo();)
		Child obj = new Child();
		obj.printInfo();
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println("객체정보 : " + obj);		
		System.out.println("현재시간1 : " + new java.util.Date().toString()); // toString이 없어도 조상껄 끌어다가 쓸 수 있음 남발하면 복잡해지니 최대한 안쓰는편으로
		System.out.println("현재시간2 : " + new java.util.Date());
	}
}



