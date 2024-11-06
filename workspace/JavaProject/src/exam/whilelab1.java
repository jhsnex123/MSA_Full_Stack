package exam;

public class whilelab1 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*6)+5; // 최대값(11-1) , ) 변에다가 +5를 하면 5~10까지의 난수
			for(int i = 1; i <= rand;i++) {   // FOR문 바깥쪽 1~9번까지 반복
				System.out.println(i * i);
				}
			System.out.println("----------------");
			
			int j = 1; 
			while(j <= rand) {
				System.out.println(j * j);;
				++j;
			}
			
		}	
		}


