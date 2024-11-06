//[ 실습 3 ] switch 문 사용 실습 
//
//1. OperAndLab.java를 복사해서 SwitchLab1.java를 생성한다.
//2. 다음 기능을 if 문이 아닌 switch 문으로 변경하여 구현한다.
//   grade 의 값이 1 또는 2 또는 3이면 다음 결과를 출력한다.
//   "x 학년은 저학년입니다."
//   grade 의 값이 4 또는 5 또는 6이면 다음 결과를 출력한다.
//   "x 학년은 고학년입니다."

public class SwitchLab_1 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*6)+1;
		switch (rand) {

		case 1:
			System.out.println(rand + " 학년은 저학년입니다.");
			break;
		case 2:
			System.out.println(rand + " 학년은 저학년입니다.");
			break;
		case 3:
			System.out.println(rand+" 학년은 저학년입니다.");
			break;	
		case 4:
			System.out.println(rand+" 학년은 고학년입니다.");
			break;
		case 5:
			System.out.println(rand+" 학년은 고학년입니다.");
			break;
		case 6:
			System.out.println(rand+" 학년은 고학년입니다.");
			break;
			default:
		}

	}
}