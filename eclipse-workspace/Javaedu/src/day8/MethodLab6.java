//[ 실습 1 ]
//
//1. 클래스명 : MethodLab6
//
//2. 구현해야 하는 메서드
//    static int getRandom(int n) 
//	1 부터 n 까지 범위의 난수 리턴
//    static int getRandom(int n1, int n2) 
//	n1 부터 n2 범위의 난수 리턴
//
//3. main() 메서드
//       getRandom(10) 을 5번 호출하고 리턴값을 하나의 행에 출력한다.
//	x, x, x, x, x
//
//       getRandom(10, 20) 을 5번 호출하고 리턴값을 하나의 행에 출력한다.
//	x, x, x, x, x
//
package day8;

public class MethodLab6 {

	public static void main(String[] args) {
		System.out.print(getRanddom(10)+", ");
		System.out.print(getRanddom(10)+", ");
		System.out.print(getRanddom(10)+", ");
		System.out.print(getRanddom(10)+", ");
		System.out.print(getRanddom(10)+" ");
		System.out.println();
		System.out.print(getRanddom(10,20)+", ");
		System.out.print(getRanddom(10,20)+", ");
		System.out.print(getRanddom(10,20)+", ");
		System.out.print(getRanddom(10,20)+", ");
		System.out.print(getRanddom(10,20)+" ");
		
	}
	static int getRanddom(int n) {	 
	n = 10;
	return n = (int)(Math.random()*10)+1;
	}
	
	static int getRanddom(int n1, int n2) {
	    n1 = 10;
	    n2 = 20;
	    int sumn = n1+n2;
		return sumn = (int)(Math.random()*20)+1;
}
}