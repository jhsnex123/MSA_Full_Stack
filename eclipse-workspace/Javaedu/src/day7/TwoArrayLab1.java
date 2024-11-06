//[ 실습 1 ]
//1. TwoArrayLab1 라는 클래스를 만든다.
//2. 4개의 행과 4개의 열을 갖는 int 타입의 2차원 배열을 생성한다.

//3. 다음과 같은 구성이 되도록 생성된 2차원 배열에 데이터를 대입한다.

//10, 12, 14, 16
//18, 20, 22, 24
//26, 28, 30, 32
//34, 36, 38, 40

//4. 출력형식

//1행 1열의 데이터 : 10
//3행 4열의 데이터 : 32
//행의 갯수 : 4
//열의 갯수 : 4
//3행의 데이터들 : 26 28 30 32
//2열의 데이터들 : 12 20 28 36
//왼쪽 대각선 데이터들 : 10 20 30 40
//오른쪽 대각선 데이터들 : 16 22 28 34

//(*) 이 실습 문제를 해결할 때 제시된 배열은 4행 4열이지만 3행 3열 또는 5행 5열 등
//사이즈가 다른 정방행열인 경우에도 요구사항이 처리될 수 있게 구현한다.  

package day7;

public class TwoArrayLab1 {

	public static void main(String[] args) {

		int[][] twoA = new int[4][4];
		int num = 8;
		for (int row = 0; row < twoA.length; row++) {
			for (int high = 0; high < twoA.length; high++) {
				num += 2;
				twoA[row][high] = num;
				System.out.printf(twoA[row][high] + "\t");

			}
			System.out.println();

		}

		System.out.println();

		System.out.println("1행 1열의 데이터 : " + twoA[0][0]);
		System.out.println("3행 4열의 데이터 : " + twoA[2][3]);
		System.out.println("행의 갯수 : " + twoA.length);
		System.out.println("열의 갯수 : " + twoA[0].length);

		System.out.printf("3행의 데이터들 : ");
		for(int row = 0; row < twoA[2].length; row++) {
			System.out.printf("%d ", twoA[2][row]);
			
			
		}
		System.out.println();
		System.out.printf("2열의 데이터들 : ");
		for(int high = 0; high < twoA.length; high++) {
			System.out.printf("%d ", twoA[high][1]);
		}
		System.out.println();
		System.out.printf("왼쪽 대각선 데이터들 : ");
		for(int i = 0; i < twoA.length; i++) {
			System.out.printf("%d ", twoA[i][i]);

}
		System.out.println();   // 이해가 잘 안돼요 ㅜㅜ
		System.out.printf("오른쪽 대각선 데이터들 : ");
		for(int i = 0, j = 0; i <twoA.length; i--, j++ ); {
				
}
}
}