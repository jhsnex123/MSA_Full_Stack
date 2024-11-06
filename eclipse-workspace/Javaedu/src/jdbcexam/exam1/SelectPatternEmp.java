package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectPatternEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select ename, job, sal, deptno  from emp where ename like '%T%'");
		System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
		System.out.println("  -----------------------------------");
		while (rs.next()) { //- 결과값을 저장할 수 있다.

								//- 저장된 값을 한 행 단위로 불러올 수 있다. --> 이래서 무한루프인 while문을 쓰는거같다..

								//- 한 행에서 값을 가져올 때는 타입을 지정해 불러올 수 있다.
		
				System.out.printf("%10s%12s%8d%4d\n", 
						rs.getString("ename"), rs.getString("job"), 
						rs.getInt("sal"), rs.getInt("deptno"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
