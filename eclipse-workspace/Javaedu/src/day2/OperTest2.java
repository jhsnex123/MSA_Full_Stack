package day2;

public class OperTest2 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		System.out.println("-----int와 int-----");
		System.out.println(num1 + num2);//8
		System.out.println(num1 - num2);//2
		System.out.println(num1 * num2);//15
		System.out.println(num1 / num2);//1
		System.out.println((double)num1 / num2);//1.66666666667
		System.out.println(num1 % num2);//2
		double num3 = 5.0;
		double num4 = 3.0;
		System.out.println("-----double과 double-----");
		System.out.println(num3 + num4);//8.0
		System.out.println(num3 - num4);//2.0
		System.out.println(num3 * num4);//15.0
		System.out.println(num3 / num4);//1.66666666667
		System.out.println(num3 % num4);//2.0
		System.out.println("-----double과 int-----");
		System.out.println(num3 + num2);//8.0
		System.out.println(num3 - num2);//2.0
		System.out.println(num3 * num2);//15.0
		System.out.println(num3 / num2);//1.66666666667
		System.out.println(num3 % num2);//2.0
	}
}
