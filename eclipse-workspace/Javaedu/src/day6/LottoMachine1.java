package day6;

public class LottoMachine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the array
		int lotto[] = new int[6];
		
		// Get 6 random numbers(1 ~ 45) and put into the array
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)((Math.random() * 6) + 1);
			if (i == 0) {
				continue;
			}
			// Check if there is the same number under [i]
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {					
					i--;
					break;
				}
			}
		}
		
		// Print
		System.out.print("오늘의 로또 번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			if (i == lotto.length - 1) {
				break;
			}
			System.out.print(", ");
		}
	}
}
