package reviewTEST2;

//[ 실습 3 ] 연산자 실습
//
//1. TimeTest 라는 클래스를 생성한다.
//2. time 이라는 변수를  int 타입으로 선언하여 32150(초) 이라는 값을 저장한다.   
//3. time 변수의 값을 가지고 연산식을 만들어서
//    "XX시간 XX분 XX초" 형식으로 변환하여 화면에 출력한다.
//위의 결과를 만들기 위해서 변수선언과 식 정의는 모두 임의로 정한다.

public class TimeTest {

	public static void main(String[] args) {
		int time =32150;

		int hour = time / 3600;  // 시간은 총시간 (초)에서 3600 나눈 몫으로 추출한다.
		int minute = (time % 3600)/60;  // 미닛은 총시간 (초)에서 3600을 나눈 나머지값에서 /60을 나누면 분값이 추출
		int second = time % 60;// 초는 총시간(초)에서 60을 나눠서 나온 나머지값으로 초 값이 추출
		System.out.println(hour+"시간 "+ minute +"분 " + second +"초");

	}

}
