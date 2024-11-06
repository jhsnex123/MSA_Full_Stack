//package day16;
//
//import java.io.File;
//import java.util.Scanner;
//
//public class CountLab {
//
//	public static void main(String[] args) {
//		File f = new File (‪"C:/Temp/yesterday.txt");
//		int count = 0;
//		try(Scanner sc = new Scanner(f);) {
//			while (sc.hasNext()) {
//				String word = sc.next().toLowerCase();
//				System.out.println(word);
//				word = word.replaceAll("\\.", "");
//				if(word.equals("yesterday")||word.equals("yesterday")) {
//					count+=1;
//				
//				}
//			}
//		}catch (Exception tp) {
//			System.out.println("gg");
//		}
//	}
//	System.out.println("yesterday 라는 단어는 +count+개 있습니다.");
//}
