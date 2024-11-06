package day11;              //super()<->this()  같은 의미인데 super는 조상클래스만 먼저 호출 해주는데 첫행에 this가 있으면 this로 씀   
									// 클래스는 뼈 생성자 메소드가 살 변수는 근육
class A {
	A(){
			System.out.println("A 클래스의 객체 생성~~");
	}
}
class B extends A{                      // extends 애는 조상
	B(int n ){
			System.out.println("B 클래스의 객체 생성~~");
	}
}
class C extends B{
	C(){
			super(10);
			System.out.println("C 클래스의 객체 생성~~");
	}
}


public class ABCTest {
	public static void main(String[] args) {
		new C();

	}
}
