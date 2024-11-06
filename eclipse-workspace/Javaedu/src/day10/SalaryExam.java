package day10;

class SalaryExpr {
	int bouns;

	SalaryExpr() { // 보너스 안받는애 생성자 메서드에 아규먼트값이 없을떄 자동으로 0으로 계산됨 (int형)
	}

	SalaryExpr(int bouns) {
		this.bouns = bouns;
	}

	int getSalary(int grade) {
		switch (grade) {
		case 1:
			return bouns + 100;
		case 2:
			return bouns + 90;
		case 3:
			return bouns + 80;
		case 4:
			return bouns + 70;
		default:
			return bouns;
		}

	}
}

public class SalaryExam {
	public static void main(String[] args) {
		int month = (int) (Math.random() * 12) + 1;
		int grade = (int) (Math.random() * 4) + 1;
		
		SalaryExpr sal = new SalaryExpr();
		
		if (month % 2 == 0) { 
			 sal.bouns = 100; //1~12 에서 2로 나누면 나머지는 0 그러므로 짝수가 됨 
			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, sal.getSalary(grade));
		} else {
			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, sal.getSalary(grade));

		}
	}
}
