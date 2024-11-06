
//[ 실습 4 ]
//1. ForLab4 이라는 클래스를 만든다.
//2. 1부터 10사이의 난수를 하나 추출한다.
//3. 30부터 40사이의 난수를 하나 추출한다.
//4. 첫 번째 난수부터 두 번째 난수 까지의 숫자들 중에서 짝수의 합을 구해
//    다음 형식으로 출력한다.
//
//    X 부터 Y 까지의 짝수의 합 : XX

public class ForLab4 {

	public static void main(String[] args) {
		
	int rand1 = (int)(Math.random()*10)+1;
	int rand2 = (int)(Math.random()*11)+30;
	
	System.out.println("x값 출력 : "+ rand1);
	System.out.println("y값 출력 : "+ rand2);     // ln으로 출력했기 때문에 다음행 자동 개행처리(행분리)
	
	
	int sum = 0;
	for(int i = rand1; i <= rand2; i++) {
		if(i % 2 == 0 ) {
			sum += i;
			System.out.println(rand1 + "부터" + rand2 + "까지의 짝수의 합 : " + sum);
		}
	}
}
}