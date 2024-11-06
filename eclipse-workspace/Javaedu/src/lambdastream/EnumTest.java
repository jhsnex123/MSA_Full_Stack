package lambdastream;

enum Season {
	SPRING, SUMMER, FALL, WINTER        // 넷중에 하나만 값을 가질수 있음  Season 에 들어 있는 값은 상수개념으로도 쓰임
}
public class EnumTest {
	public static void main(String args[]) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		Season enum_v = Season.FALL;           // 열거형      Season은 하나의 상수타입 
		if (enum_v == Season.FALL)
			System.out.println("당신이 좋아하는 계절은 가을!!");
		printFruit(enum_v);
		
		//enum_v = "SPRING"; 
		enum_v = Season.SPRING;	
		if (enum_v == Season.SPRING)
			System.out.println("당신이 좋아하는 계절은 봄!!");
		printFruit(enum_v);
	}
	static void printFruit(Season p) {           // 타입대신 Season 열거형 타입을 가져다 쓸수 있고 대신 Season에 있는 값만 쓸 수 있음(상수 ex.final)
		switch (p) {
		case SPRING:
			System.out.println("대저토마토");
			break;
		case SUMMER:
			System.out.println("복숭아");
			break;
		case FALL:
			System.out.println("홍로");
			break;
		case WINTER:
			System.out.println("레드향");
		}		
	}
}
