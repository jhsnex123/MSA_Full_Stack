package day5;

public class ControlLab2 {

	public static void main(String[] args) {
		int count = 0;
		while(true) {
    	   int rand = (int)(Math.random()*11)+10;
    	   
    	    System.out.printf("[%d]\n", rand);
    	   
    	   if(rand % 3 == 0 || rand % 5 == 0 ) {
    		  
    		 System.out.println("합 = "+(rand*rand));
    		 
    		 count++;
       }else if(count <= 11) {
    	    System.out.println(rand+"회 반복함");
       }else if(count <= 17) {
    		System.out.println(rand+"회 반복함");
       }else if(count <= 19) {
		    System.out.println(rand+"회 반복함");
       } else {	    
    	    System.out.println(rand+"재수행");
    	   break;
}
}
}
}