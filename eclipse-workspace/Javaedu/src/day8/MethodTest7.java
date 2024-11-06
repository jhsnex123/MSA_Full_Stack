package day8;

public class MethodTest7 {

	public static void main(String[] args) {
		m1();                           
		int r = m2(10);  //리턴값이 호출 되어도 매개변수()를 기입해야지 사용가능
		
 		System.out.println(r * 100);
 		System.out.println(r / 10);
 		System.out.println(m3(10,20));
 		System.out.println("큰 값 : " + m3(200,100));
 		boolean r2 = m4('A');
 		System.out.println(r2);
 		r2 = m4('a');
 		System.out.println(r2);
 		if(m4('W'))   // Boolean형의 리턴값은 if로도 사용 가능 아래 출력 내용은 if가 ture이기때문에 바로 출력이 가능했던것
 			System.out.println("대문자");
	}

	static void m1() { // 리턴값 없음 void 매개변수 없음x 호출만 가능 값사용으론 안됨
		System.out.println(new java.util.Date()); // 현재 날짜 시간 장소 알려주는 기능?
	}
	static int m2(int p) {          
		int sumV=0;
		for(int n=1; n<= p; n++)
			sumV += n;
		return sumV;
}

	static int m3(int p1, int p2) {
		if (p1 > p2)
			return p1;
		else
			return p2;
	}
	static boolean m4 (char p) {
		boolean result = false;
		if(p >= 'A' && p <= 'Z')
			result = true;
		return result;
     }
}
