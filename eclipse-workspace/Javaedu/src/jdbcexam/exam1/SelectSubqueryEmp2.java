package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement; // statement보다 성능이 좋음
import java.util.Scanner;

// Statement -> PreparedStatement
public class SelectSubqueryEmp2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		PreparedStatement pstmt = conn.prepareStatement("SELECT ename, job, sal, deptno  FROM emp "
				+ "WHERE deptno = (SELECT deptno FROM dept WHERE dname = ?)"); // sql 명령을 미리 해야지 쓸수 있음 그리고 괄호안에 sql 명령문 삽입 prepareStatement
		Scanner scan = new Scanner(System.in);                                                //? -> 동적 파라미터 여러개 가능
		System.out.print("부서명을 입력하세요 : ");
		String departmentname = scan.nextLine();
		pstmt.setString(1, departmentname); //1->? 임
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
			System.out.println("  -----------------------------------");
			do {
				System.out.printf("%10s%12s%8d%4d\n", rs.getString("ename"), rs.getString("job"), 
						rs.getInt("sal"), rs.getInt("deptno"));
			} while (rs.next());
		} else {
			System.out.println("\n추출되는 직원 정보가 없습니다.");
		}
		scan.close();
		rs.close();
		pstmt.close();
		conn.close();
	}
}
