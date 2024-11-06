//1. TwoArrayLab3 라는 클래스를 만든다.
//2. 다음의 내용대로 int 타입의 2차원 배열을 생성한다.
//데이터는 4주간의 요일별 게임 시간이다.

//일 월  화  수 목 금  토  
//1주 	5,  2,  1,  0,  2,  3,  6
//2주	4,  3,  2,  1,  1,  0,  5
//3주	3,  1,  2,  1,  3,  1,  3
//4주	4,  3,  1,  0,  4   2,  7

//요일별 게임시간의 합을 구하여 7개의 방을 갖는 int 타입의 배열을 생성해서 저장하고 출력한다. 
//이 때 저장 순서는 일요일~ 토요일순이다.

//일요일 : 16시간
//월요일 : 9시간
//화요일 : 6시간
//수요일 : 2시간
//목요일 : 10시간
//금요일 : 6시간
//토요일 : 21시간

//주별 게임 시간의 합을 구하여 4개의 방을 갖는 int 타입의 배열을 생성해서 저장하고 출력한다.

//1주차 : 19시간
//2주차 : 16시간
//3주차 : 14시간
//4주차 : 21시간

package day7;

public class TwoArrayLab3 {
	public static void main(String[] args) {

		int[][] table = { { 5, 2, 1, 0, 2, 3, 6 }, { 4, 3, 2, 1, 1, 0, 5 }, { 3, 1, 2, 1, 3, 1, 3 },{ 4, 3, 1, 0, 4, 2, 7 } };

		int[] dayT = new int[7];

		for (int i = 0; i < table.length; i++) { // 바깥 FOR문(행)
			for (int j = 0; j < table[i].length; j++) { //// 바깥 FOR문(열)
				dayT[j] += table[i][j]; // 행,열 합계 값을 int형을 dayT에 대입
			}
		}

		System.out.println("요일별 게임시간:");
		System.out.println("일요일 : " + dayT[0] + "시간");
		System.out.println("월요일 : " + dayT[1] + "시간");
		System.out.println("화요일 : " + dayT[2] + "시간");
		System.out.println("수요일 : " + dayT[3] + "시간");
		System.out.println("목요일 : " + dayT[4] + "시간");
		System.out.println("금요일 : " + dayT[5] + "시간");
		System.out.println("토요일 : " + dayT[6] + "시간");

		int[] weekT = new int[4];

		for (int i = 0; i < table.length; i++) {
			int week = 0;
			for (int j = 0; j < table[i].length; j++) {
				week += table[i][j];
			}
			weekT[i] = week;
		}

		System.out.println("주별 게임시간:");
		for (int i = 0; i < weekT.length; i++) {
			System.out.println((i + 1) + "주차 : " + weekT[i] + "시간");
		}
	}
}