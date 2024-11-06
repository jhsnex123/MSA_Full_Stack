//[ 실습 2 ]
//1. ForLab2 이라는 클래스를 만든다.
//2. "DUKE" 라는 리터럴로 초기화되는 String 타입의 상수를 선언한다.
//3. 다음과 같은 결과가 출력되도록 for 문을 사용해서 구현한다.
//
//    DUKE1 DUKE2 DUKE3 DUKE4 DUKE5 
public class ForLab2 {

	public static void main(String[] args) {
		String num = "DUKE";

		for(int i = 1; i<=5; i++) {
			
			System.out.print(num+i+" ");
		}

	}

}
