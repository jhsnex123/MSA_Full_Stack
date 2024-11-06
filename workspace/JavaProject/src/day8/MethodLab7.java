//[ 실습 2 ]
//
//1. 클래스명 : MethodLab7
//2. 정의해야 하는 메서드(2개)
//   메서드명 : createArray
//   매개변수 타입 : int
//   리턴값의 타입 : int[]
//   기능 : 1부터 매개변수로 전달된 값까지의 값으로 구성되는 배열을 만들어 리턴한다.
//
//   메서드명 : printArray
//   매개변수 타입 : int[]
//   리턴값의 타입 : void
//   기능 : 매개변수를 통해서 전달된 배열의 element 값들을 다음 형식으로 출력한다. 
//
//	값1,값2,값3, ....
//
//
//3. main() 메서드에서 다음 수행 문장들을 복사하여 수행시켰을 때
//   
//	printArray(createArray(10));
//	printArray(createArray(5));
//	int[] result = createArray(3);
//	printArray(result);
//
//  다음과 같이 결과가 출력된다면 createArray() 외 printArray() 는 제대로 구현한 것이다.
//
//	1,2,3,4,5,6,7,8,9,10
//	1,2,3,4,5
//	1,2,3	
package day8;

public class MethodLab7 {

	public static void main(String[] args) {
	    printArray(createArray(10));
	    System.out.println();
		printArray(createArray(5));
		System.out.println();
		int[] result = createArray(3);
		printArray(result);
		

	}
	static int[] createArray (int n) {
		 int[] ary = new int[n];
		for(int i = 0 ; i<n ; i++) { 
		ary[i] =i + 1;
			 
	}
		 return ary;
}
	static void printArray (int[] p) {
		for (int k = 0; k < p.length; k++) {
			if (k == p.length - 1) {
				System.out.printf("%d", p[k]);
			} else {
				System.out.printf("%d, ", p[k]);
			}
}
}
}