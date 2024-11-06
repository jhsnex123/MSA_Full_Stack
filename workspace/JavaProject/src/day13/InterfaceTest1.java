package day13;

interface Printable {    //  interface을 쓸 때 java .lang?에서 자동으로 제어자 변수 기능 넣어줌(생략해도)
	public static final int PRINT_TYPE1 = 1;
	static final int PRINT_TYPE2 = 2;
	final int PRINT_TYPE3 = 3;
	int PRINT_TYPE4 = 4;       //초기화 값은 무조건 넣어야함!

	public abstract void print(int type);     // 메서드도 생략해도 abstract메서드 자동추가
	abstract void setPage(int su);          //{} 코드블럭 넣으면 안됨
	boolean isAvailable(); //abstract (); --< 끝낼때 세미클론으로 마무리 해야함
}

abstract class Shape3 {
	String color;

	abstract void draw();

	void setColor(String color) {
		this.color = color;
	}
}

class Circle3 extends Shape3 implements Printable {
	int page;

	void draw() {
		System.out.println(color + " 원을 그리는 기능");
	}

	public void print(int type) {
		System.out.println(type + "번 방식으로 " + page + "페이지를 프린팅한다.");
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean isAvailable() {    //오버라이딩을 할 때는 public을 꼭 붙어야함!
		if (color.equals("흰색"))
			return false;
		else
			return true;
	}
}

class Rectangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

public class InterfaceTest1 {
	public static void main(String args[]) {
		printOut(new Circle3());
		//printOut(new Rectangle3()); // 컴파일 오류가 발생하는 행
	}

	static void printOut(Printable prt) {
		prt.setPage(100);
		((Shape3)prt).setColor("파란색");
		if (prt.isAvailable())
			prt.print(Printable.PRINT_TYPE2);
	}
}
