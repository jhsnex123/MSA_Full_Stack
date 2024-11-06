package day7;
public class MethodTest5 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		String name = getMyName();
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println("main() 수행종료");
		
	}
	private static String getMyName() {
		// TODO Auto-generated method stub
		return null;
	}
	static String getMyname() {//매서드 헤더 (이름, 매기변수,리턴값 유형)
		return "유니코";
     }
}