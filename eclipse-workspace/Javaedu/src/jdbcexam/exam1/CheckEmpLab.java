package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CheckEmpLab {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("직원의 이름을 입력하세요 : ");
			String name = scan.nextLine();
			ResultSet rs = stmt.executeQuery("SELECT ename, DATE_FORMAT(hiredate,'%Y년 %m월') hd,"
					+ "deptno FROM emp WHERE ename = '" + name + "' ");
			if (rs.next()) {
				System.out.println(rs.getString("ename") + "직원은 근무중입니다.");
				System.out.println(rs.getString("hd") + "에 입사했고 현재" + rs.getString("deptno") + " 번부서에서 근무하고 있습니다.");	
			} else {
				System.out.println(name+"직원은 근무하지 않습니다.");
				System.out.print("직워을 검색하시겠습니까? ");
				String an = scan.nextLine();
				if (an.equals("네")) {
					System.out.println("종료");
					break;
				}
				rs.close();
			}
			stmt.close();
			conn.close();
			scan.close();
		}
	}
}