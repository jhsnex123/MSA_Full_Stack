//[ 실습 2 ]
//
//1. 클래스명 : MethodLab3
//
//2. 구현해야 하는 추가 메서드 (static 붙여서)
//   매개변수 : char 타입 1개, int 타입 1 개 
//   리턴값 : 없음
//   메서드명 : 임의로
//   기능 : 첫 번째 아규먼트로 전달된 문자를 
//           두 번째 아규먼트로 전달된 숫자의 행으로 구성되는 삼각형을 출력한다.
//           (출력해야 하는 삼각형 모양은 3번을 참고한다.-직각삼각형)
//
//3. main() 메서드에서는 다음과 같이 아규먼트를 전달하면서 2번에 구현한 메서드를 다음과 같이 호출한다.
//   여기에서는 메서드명을 편의상 xxx 라고 함. 구현할 때는 적당한 명칭을 지정해야 함.
//
//     xxx('@', 3)
//
//	 @
//           @@
//        @@@
//
//     xxx('#', 4)
//
//	#
//           ##
//         ###
//       ####
//
//     xxx('A', 5)
//
//	A
//           AA
//         AAA
//       AAAA
//     AAAAA

package day8;

public class MethodLab3 {

	public static void main(String[] args) {
		triAngle('@', 3);
		triAngle('#', 4);
		triAngle('A', 5);
		
	}
	
	static void triAngle(char c ,int num) {
		
		for(int i = 1; i <= num ; i++) {
			for(int j =0 ; j < num - i; j++) {
				System.out.print(" ");
			}	
			for(int m =0; m < i; m++) {
				System.out.print(c);
			}
			System.out.println();
	
}
	
}
}
