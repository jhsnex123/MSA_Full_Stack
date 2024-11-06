package day6;

public class LottoMachine1_1 {

	public static void main(String[] args) {
		int todayLotto[] = new int[6];		

		for (int i = 0; i < todayLotto.length; i++) {
			int rand = (int) (Math.random() * 6) + 1;
			todayLotto[i] = rand;
			for (int j = 0; j < i; j++) {
				if (todayLotto[i] == todayLotto[j]) {
					i--;
					break;
				}
			}
		}

		System.out.print(" 오늘의 로또 번호 - ");
		for (int k = 0; k < todayLotto.length; k++) {
			if (k == todayLotto.length - 1) {
				System.out.printf("%d", todayLotto[k]);
			} else {
				System.out.printf("%d, ", todayLotto[k]);
			}
		}
	}
}
