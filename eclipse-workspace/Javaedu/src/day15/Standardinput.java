package day15;

public class Standardinput {

	public static void main(String[] args) throws Exception{
		System.out.print("입력 : ");
		int input = System.in.read();   //read는 한문자만 읽음
		System.out.println("출력 : "+(char)input);
	}

}
