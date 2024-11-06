package day7;

public class TwoArrayLab5 {
	public static void main(String[] args) {
		int ary[][] = new int[5][3];		//INT형 행,배열값 [5],[3]
		
		for(int[] row : ary) {            //향상된 바깥 FOR문  
			for(int num : row)
				System.out.print(num+"\t");
			System.out.println();
		}
		System.out.println();
		int value = 1;
		for(int j=0; j < ary[0].length; j++)
			for(int i=j; i < ary.length-j; i++)
				ary[i][j] = value++;
		
		for(int[] row : ary) {
			for(int num : row)
				System.out.print(num+"\t");
			System.out.println();
		}
	}
}
