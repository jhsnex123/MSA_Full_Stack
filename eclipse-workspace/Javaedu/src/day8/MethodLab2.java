//1. 클래스명 : MethodLab2
//
//2. 구현해야 하는 추가 메서드 (static 붙여서)
//   매개변수 : char 
//   리턴값 : char
//   메서드명 : getUpper
//   기능 : 매개변수에 전달된 값이 영문 소문자인지 채크하여
//           대문자로 변환해서 리턴한다.
//           영문 소문자가 아니면 무조건 '@' 를 리턴한다.
//
//3. main() 메서드에서는 다음과 같이 getUpper() 를 호출하고 리턴 결과를 화면에 
//   출력한다.(다음 수행 문장들을 main() 메서드 안에 그대로 복사하여 실행시킨다.)
//
//	System.out.println(getUpper('a'));
//	System.out.println(getUpper('A'));
//	System.out.println(getUpper('z'));
//	System.out.println(getUpper('!'));
//	System.out.println(getUpper('w'));
//
//	수행 결과는 다음과 같이 출력될 것이다.
//
//	A
//	@
//	Z
//	@
//	W
//package day8;

package day8;
public class MethodLab2 {

	public static void main(String[] args) {
		System.out.println(getUpper('a'));
		System.out.println(getUpper('A'));
		System.out.println(getUpper('z'));
		System.out.println(getUpper('!'));
		System.out.println(getUpper('w'));

	}
	static char getUpper(char c) {
	if(c >= 'a' && c <= 'z' ) {
		return  (char) (c - 32);
	} else {
	return '@';
	}
	}
}
