package day6;

public class LottoMachine1_2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		System.out.print("오늘의 로또 번호 - ");
		for (int i = 0; i < lotto.length; i++) { // 0 ~ 5
			lotto[i] = (int) (Math.random() * 6) + 1; // 1 ~ 45 사이 난수 삽입
			
			for(int j = 0; j < i;) { // 0 ~ 4
				if(i == 0) { // i가 첫번째는 건너 뜀 
					break;
				}
				else if(lotto[i] == lotto[j]) { // i : 1 ~ 5, j : 0 ~ 4
					lotto[i] = (int) (Math.random() *6) + 1; // 값이 같으면 1 ~ 45 난수 다시 삽입
					j = 0; // j값 초기화
				}
				else {
					j++; // 값 증가
				}
			}
			if(i == lotto.length - 1) {
				System.out.printf("%d", lotto[i]);
			}
			else {				
				System.out.printf("%d, ", lotto[i]);
			}
		}
	}
}
