package jdbcexam.exam2;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertImage {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner scan = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO imgtest (filename, imgcontent) VALUES (?, ?)")){ // 이미지 파일을 저장할때 PreparedStatement 애 무조건 써야함 
			System.out.print("저장할 이미지 파일명을 절대 패스로 입력하세요 : ");
			String name = scan.nextLine();
			File imgFile = new File(name);
			if (imgFile.exists()) {
				FileInputStream fin = new FileInputStream(imgFile); // FileInputStream (읽기모드) 바이트 스트림    ...reader는 문자 스트림 둘 다 ipo api임
				pstmt.setString(1, imgFile.getName()); //file이름만 나옴 -->getName();            set string은 직접 객체 전달해야함 setBinaryStream 애는 스트링 객체한테 전달만해주면됨
				pstmt.setBinaryStream(2, fin, (int)imgFile.length()); //  (int)imgFile.length(); 파일 사이즈 알려주는 객체 BinaryStream--> 0,1만 쓸 수 있는 이진법 객체
				pstmt.executeUpdate(); //-> ex.image(totoro.png)를 읽고 2번째 칼럼값에다가 전달해줌
				System.out.println("이미지 삽입 성공");
			} else {
				System.out.println("[오류] 이미지가 존재하지 않음");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
