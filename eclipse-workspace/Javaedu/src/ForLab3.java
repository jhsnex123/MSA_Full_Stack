//[ 실습 3 ]
//1. ForLab3 이라는 클래스를 만든다.
//2. 다음과 같은 결과가 출력되도록 for 문을 사용해서 구현한다.
//
//    9 : 홀수
//    8 : 짝수
//    7 : 홀수
//    6 : 짝수
//    5 : 홀수
//    4 : 짝수

public class ForLab3 {

	public static void main(String[] args) {
	
		for(int i = 9; i>=1; i--) {
			if(i % 2 == 0 ) {
				System.out.println(i+ " : 짝수");
			}else {
			System.out.println(i+ " : 홀수");
		}

	}

}
}