package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ScannerFromFile {
	public static void main(String args[]) {
		File f = new File("c:/iotest/output.txt");  // 스캐너를 파일로 읽으면 입력직접안하고 읽을수 있음 
		try (Scanner scan = new Scanner(f);) {     // 스캐너를(in)으로  넣으면 직접 읽어야하고 지금은 파일형식을 읽고있음
			if(new Random().nextBoolean()) { 
				System.out.println("[ 행 단위 ]");
				while(scan.hasNext()) 
					System.out.println(scan.nextLine());			 // next에 읽는 타입에 따라 형태가 바뀜 정수형(nextint)
			} else {
				System.out.println("[ 워드 단위 ]");
				while(scan.hasNext()) 
					System.out.println(scan.next());		
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않네요...ㅜ");
		}					
	}
}
