package day8;

public class MethodTest9_1 {

	public static void main(String[] args) {
		int v1, v2, v3;
		v1 = 10;
		v2 = 20;
		v3 = 30;
	
		System.out.println(add(v1, v2));
		System.out.println(add(v3, 100));
		System.out.println(add(v1, v2, v3));
		//System.out.println(add(v1, v2, v3, 100));
	}
	static int add(int p1, int p2) {
		return p1 + p2;
		
        }
	static int add(int p1, int p2, int p3) {   // 클라스 안에 똑같은 매기변수를 만들순 없지만 갯수를 늘리는건 된다 그게 오버로딩
		return p1 + p2 + p3;
}
}