package day7;
public class MethodTest1_1 {
	public static void main(String[] args) {           
		System.out.println("main() 수행시작");
		printMyName();
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() 수행종료");
	
	}
	static void printMyName() {  //  ()안에매기변수하고 리턴값이 있는지 확인!
		System.out.println("유니코");
		return; //호출한 값으로 되돌아가는 뜻 마지막으로 쓰면 생략가능
	}
}
