//[ 실습1 ]모양 출력(중첩 for)
//1. ForLab7 라는 클래스를 만든다.
//2. char 타입으로 상수를 하나 만들어 '&'로 초기화 한다.
//    (상수를 만드는 방법은 변수 선언시 앞에 final 을 붙인다.)
//3. 5부터 10사이의 난수를 하나 추출한다.
//4. 추출된 숫자가 5라면 반복문을 사용하여 다음과 같이 출력한다.
//
//	&
//	&&
//	&&&
//	&&&&
//	&&&&&
//    
//     추출된 숫자가 7이라면 반복문을 사용하여 다음과 같이 출력한다.
//
//	&
//	&&
//	&&&
//	&&&&
//	&&&&&
//	&&&&&&
//	&&&&&&&

public class ForLab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char NUM = '&';
		int rand = (int)(Math.random()*10)+5;
		for(int i=1;i<=5;i++) {                      //바깥 for문                												// 안쪽 for문
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print(NUM);
			}
	
		}
	
	}

}

