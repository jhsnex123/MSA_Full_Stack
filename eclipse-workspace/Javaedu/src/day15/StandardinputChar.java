package day15;

import java.io.InputStreamReader;

public class StandardinputChar {

	public static void main(String[] args) throws Exception{
		System.out.print("입력 : ");
		int input =new InputStreamReader (System.in).read();   //read는 한문자만 읽음
		System.out.println("출력 : "+(char)input);  //형변환
	}

}
