package day16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
			reader = new FileReader("c:/iotest/output.txt");
			while (true) {
				int data = reader.read();  // read 일반동사 '읽다' (한문장만) 영어 1바이트, 한글/ 2바이트 읽을게 없으면 -1값을 줌 그떄는 조건문으로 걸어서 break로 멈추면됨
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) {         // 예외처리 구문
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");      // 부모 캐치는 맨 마지막 최후에 쓰이는거
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
