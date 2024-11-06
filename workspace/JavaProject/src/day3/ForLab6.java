package day3;

public class ForLab6 {
	

	public static void main(String[] args) {
		int random1 = (int)(Math.random() * 8)+ 3; //0+3 ~7+3
		int random2 = (int)(Math.random() * 3)+ 1; //0+3 ~2+1
		
		String deco;
		if(random2==1) {
			deco= "*";
		}else if(random2==2) {
				deco= "$";	
		}else {
			deco= "#";
}
		
		for(int num = 1; num <= random1 ; num++)
			System.out.print(deco);
}
}