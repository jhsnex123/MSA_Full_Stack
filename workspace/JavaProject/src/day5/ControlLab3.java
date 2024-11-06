package day5;

public class ControlLab3 {
//초기화 해야함
	public static void main(String[] args) { // 반복문을 쓸 땐 while, for
		int num = 1;  // String 변수->카멜케이스 표기법 소대문자 구분
		
	   while(num<=5) {
		   int rand = (int)(Math.random()*50)+1;
		   
		    if(rand>=40) {
		    	System.out.println(rand + "번은 듀크반");
		  } else if(rand>=30) {
			  	System.out.println(rand + "번은 턱시반");
		  } else if(rand>=20) {
				System.out.println(rand + "번은 둘리반");
		  } else if(rand>=10) {
				System.out.println(rand + "번은 올라프반");
		  } else {
			    System.out.println(rand + "번은 엘사반");
			    
			    
			    num++;
			  
}
}
}
}