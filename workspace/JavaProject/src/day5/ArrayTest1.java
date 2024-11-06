package day5;
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] score = new int[5];		
		System.out.println(score.length); //5
		System.out.println(score);  //참조값
		System.out.println(score[0]); // 0
		System.out.println(score[4]); //0
		//System.out.println(score[5]);
		
		score[0] = 15;
		System.out.println(score[0]);
		score[3] = score[0] * 2; 
		for(int i=0;i < score.length;i++)
			System.out.print(score[i] + " ");
		System.out.println();
		
		for(int i=score.length-1;i >= 0;i--)
			System.out.print(score[i] + " ");
		System.out.println();
		
		for(int elem : score)
			System.out.print(elem + " ");
		System.out.println();

		for(int i=0;i < score.length;i++)
			score[i] = (i+1) * 10; //score[0] = 10
		for(int elem : score)
			System.out.print(elem + " ");
		System.out.println();
		
		score = new int[] { 11, 12, 13, 14 }; // 새로운 배열 생성 new로 생성되면 기존 참조형(방)을 폐기시킴
															// { 값1, 값2, 값3, ...} ->-->(배열변수없이도 변경가능) 단 배열생성과 
		                                                   //배열변수 선언을 동시할 때만 가능하다. 
		System.out.println(score.length);
		System.out.println(score);
		for(int elem : score)
			System.out.print(elem + " ");
		System.out.println();		
	}
}






