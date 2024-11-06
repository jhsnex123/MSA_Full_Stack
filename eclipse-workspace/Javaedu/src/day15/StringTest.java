package day15;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    			//				1
		System.out.println("가나다".length()); 			//			가나다
		System.out.println("abc".charAt(1)); 			//				a
		System.out.println("abc".toUpperCase());		// 			ABC
		
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";		
		System.out.println(str1.substring(4));  		//   		EFGHIJ      
		System.out.println(str1.substring(0, 3)); 		// 		ABC       // 3은 포함 아님!
		System.out.println(str2.indexOf("f"));  		//     		 abcdef
		System.out.println(str2.lastIndexOf("f")); 	//     	     fgfhij
		System.out.println(str2.replace('h', 'H')); 	//			 H
		
		System.out.println("abc".repeat(5));
		System.out.println("@".repeat(3));
		
		String str3 = "java jdbc html5 css javascript servlet jsp ajax";
		String[] ary = str3.split(" ");   
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray();
		System.out.println(str3.length() + " ---- " + ch.length);
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
}













