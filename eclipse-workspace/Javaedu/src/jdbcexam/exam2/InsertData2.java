package jdbcexam.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("insert into student values (?, ?)");  //->PreparedStatement 애가 Statement한테 상속을 받은거임
				Scanner scan = new Scanner(System.in);){
			while(true) {
				System.out.print("학생 이름을 입력하세요 : ");
				String name = scan.nextLine();
				System.out.print("학생 점수를 입력하세요 : ");
				int score = Integer.parseInt(scan.nextLine());
				pstmt.setString(1,  name);  //-> ? 1 string 상속받은걸 객체로씀
				pstmt.setInt(2, score); //-> ? 2 int 상속받은걸 객체로씀
				pstmt.executeUpdate(); //-> 미리 준비되어있는거라 아규먼트안에 값 넣으면 안됨
				System.out.println("student 테이블에 데이터 삽입 완료");  //프라이머리 키 값은 한번만 쓸 수있음
				System.out.print("계속 입력하겠습니까?(y/n)");
				String aws = scan.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					continue;
				} 
				System.out.println("student 테이블 데이터 삽입 작업 종료");
				break;
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} 
	}
}
