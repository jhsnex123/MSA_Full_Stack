package day8;

public class MethodTest8 {

	public static void main(String[] args) {
		int[] ary = { 10, 5, 17, 20, 8 };		
		System.out.println("ary 변수에 저장된 값 " + ary);
		System.out.println(getMax(ary));
		System.out.println(getMin(ary));
		System.out.println(getMin(new int[]{100, 50, 300}));
		
     }
	static int getMax(int[] p) {
		System.out.println("매개 변수 p 에 전달된 값 " + p);
		int result = p[0];
		for(int i =1 ; i < p.length; i++)
			if(result < p[i])
				result =p[i];
		return result;
	}
     static int getMin(int[] p) {
 		int result = p[0];
 		for(int i =1 ; i < p.length; i++)
 			if(result > p[i])
 				result =p[i];
 		return result;
	}
}