package exam;

public class WhileLab2 {

	public static void main(String[] args) {
		int pairNum1 = (int)(Math.random()*6)+1;
		int pairNum2 = (int)(Math.random()*6)+1;
		
		System.out.println(pairNum1);
		System.out.println(pairNum2);
		
		while(pairNum1>pairNum2 && pairNum1<pairNum2) {
			pairNum1++;
			pairNum2++;
			
			if(pairNum1==pairNum2) {
				int sum = pairNum1+pairNum2;
				System.out.println("게임끝"+sum);
			}
		}
		
		
}
	
	
}