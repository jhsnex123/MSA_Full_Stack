package day5;

public class WhileLab3 {

	public static void main(String[] args) {
	
		System.out.println("[수행시작]");

		int count= 0;
		while (true) {
			int rand = (int)(Math.random() *30 )+1 ; //1~30
		    if(rand == 0 || rand >=27) {
		       break;
		    }
		    count +=1;
		    
		    System.out.printf("%d-%c, %2$d, 0x%2$x\n",rand, rand +64); //반복된 변수가 많을경우 %와 포맷문자 사이에 n$를 넣으면 간결하게 수행할 수 있음
		 
        System.out.printf("[수행종료] - 출력횟수는 %d번", count);
	}
	}
}