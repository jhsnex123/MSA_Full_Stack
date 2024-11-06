//[ 실습 1 ]
//1. TwoArrayLab2 라는 클래스를 만든다.
//2. 다음의 내용대로 char 타입의 2차원 배열을 생성한다.

// 'B', 'C', 'A', 'A'
//'C', 'C', 'B', 'B'
//'D', 'A', 'A', 'D'

//3. 4개의 원소를 갖는 int 타입의 배열을 생성한다.
//첫번째 원소에는 'A' 문자의 개수    
//두번째 원소에는 'B' 문자의 개수    
//세번째 원소에는 'C' 문자의 개수    
//네번째 원소에는 'D' 문자의 개수    
//를 저장한다.

//4. 출력형식
//A 는 x개 입니다.
//B 는 x개 입니다.
//C 는 x개 입니다.
//D 는 x개 입니다.

package day7;

public class TwoArrayLab2 {
	public static void main(String[] args) {

		char[][] cA = { // 잘 모르겠습니다 ㅜㅜ
				{ 'B', 'C', 'A', 'A' }, 
				{ 'C', 'C', 'B', 'B' }, 
				{ 'D', 'A', 'A', 'D' } };

		int[] count = new int[4];

		for (int i = 0; i < cA.length; i++) { // 바깥 for문(행) 1증가
			for (int j = 0; j < cA[i].length; j++) { // 안쪽 for문(열) 1증가
				char ch = cA[i][j];  
				switch (ch) {
				case 'A':
					count[0]++;
					break;
				case 'B':
					count[1]++;
					break;
				case 'C':
					count[2]++;
					break;
				case 'D':
					count[3]++;
					break;
				}
			}
		}

		System.out.println("A 는 " + count[0] + "개 입니다.");
		System.out.println("B 는 " + count[1] + "개 입니다.");
		System.out.println("C 는 " + count[2] + "개 입니다.");
		System.out.println("D 는 " + count[3] + "개 입니다.");
	}
}