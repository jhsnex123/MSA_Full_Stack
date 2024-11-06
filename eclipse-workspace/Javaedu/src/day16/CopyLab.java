package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class CopyLab {

	public static void main(String[] args) {
		Long time = new Date().getTime();
		String st = new SimpleDateFormat("MM-dd-yyyy").format(time);
		
		try (BufferedReader reader = new BufferedReader(new FileReader("c:/iotest/sample.txt"));
				FileWriter sam = new FileWriter ("C:/iotest/sample"+st+".txt",true);){
			
			String words;
			while (true) {
				words = reader.readLine();
				if (words != null) {
					sam.write(words);
				}else {
					break;
			}
			}
			System.out.println("저장이 완료되었습니다.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException ioe) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
		
		
		
		
}
}