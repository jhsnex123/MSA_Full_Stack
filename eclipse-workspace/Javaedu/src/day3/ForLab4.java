package day3;

public class ForLab4 {
	public static void main(String[] args) {
		int random1 = (int) (Math.random() * 10) + 1; // 1~10
		int random2 = (int) (Math.random() * 11) + 30; // 0 +30 ~ 10+30
		
		int sum = 0;
		for(int num = random1; num <= random2; num++) {
			if(num%2==0)
				sum += num;
			System.out.println(random1 + " 부터" +random2+"까지의 짝수의 합 :"+ sum);
			
		}
	}
}
