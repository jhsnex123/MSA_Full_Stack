package day13;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {  //throws 예외처리 구문?
		// 싱글톤패턴이 적용되도록 만든 클래스
		Runtime  r = Runtime.getRuntime();
		//r.exec("c:/windows/notepad.exe");
		System.out.println("Runtime 객체의 exec() 메서드로 메모장 프로그램 기동시킴~~");
		Runtime  r1 = Runtime.getRuntime();
		Runtime  r2 = Runtime.getRuntime();
		Runtime  r3 = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}
}
