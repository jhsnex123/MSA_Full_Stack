package day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	public static void main(String args[]) {
		FileReader reader = null;
		BufferedReader br = null;
		try {
			reader = new FileReader("c:/iotest/output.txt");   //  FileReader 파일을 읽을라면 애를 생성 
			br = new BufferedReader(reader);             //bufferedReader는 한 행을 읽는 메서드 애는 문자만 읽을수 있음
			while (true) {
				String data = br.readLine();          //bufferedReader란 객체를 만들면 readLine(); 메서드를 만들면됨 리턴값은 스트링 읽을게 없으면 null
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (IOException ioe) {    //FileNotFoundException 애가 자손이기 떄문에 부모가 같이 catch해줌
			System.out.println("예외발생 : "+ioe.getMessage());
		} finally {
			try {
				br.close();
				reader.close();
			} catch (Exception e) {    
				e.printStackTrace();
			}
		}
	}
}
