package day11;
import day9.MethodLab6;
class Multiplication {
private int dan;
private int number;

Multiplication() {
	
}

Multiplication(int dan) {
this.dan = dan;
}

Multiplication(int dan, int number){
this.dan = dan;
this.number = number;
}

void printPart() {
if (number == 0) {
for(int n=1; n <= 9; n++)
System.out.print("\t"+dan + "*" + n+ "="+dan*n);
System.out.println();
} else {
System.out.println(dan * number);
}
}
}


class GuGuDanExpr extends Multiplication{
	
	GuGuDanExpr(int dan, int number){
		super(dan,number);
		
	}
	
	void printAll() {
		for(int i = 1; i <=9 ; i++) {
			for(int j = 1 ; j<=9; j++) {
				System.out.print("\t"+i + "*" + j+ "="+i*j);
			}
			System.out.println();
		}
	}

public class GuGuDanApp {

	public static void main(String[] args) {
		
		
	
	}
		
	
	    
}
}