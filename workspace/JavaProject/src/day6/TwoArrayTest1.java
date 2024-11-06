package day6;

public class TwoArrayTest1 {
	public static void main(String[] args) {
		int[][] two = new int[2][5];
		System.out.println(two);	// [[I@행의배열의 16진수 참조값
		System.out.println(two[0]); // [I@첫번째행이참조하는열의배열의 16진수 참조값
		System.out.println(two[1]); // [I@두번째행이참조하는열의배열의 16진수 참조값
		System.out.println(two[0][0]); //0	
		System.out.println(two.length); //2
		System.out.println(two[0].length); //5
		
		for(int row=0;row < two.length;row++) {
			for(int col=0; col < two[row].length; col++)
				System.out.print(two[row][col]+" ");
			System.out.println();
		}
	}
}



