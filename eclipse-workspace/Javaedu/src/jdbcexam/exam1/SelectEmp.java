package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement(); //Statement(Object target, String methodName, Object[] arguments)
																	//Statement이름과 인수 배열로 지정된 메서드를 호출하기 위해 지정된 대상 객체에 대한 새 객체를 만듭니다 .
		ResultSet rs = stmt.executeQuery("select ename, job, format(sal, 0) sal, deptno  from emp"); //-> ResultSet 애가 executeQuery 붙으면 NULL값 절대 못들어감
		System.out.printf("%10s%10s%10s%10s\n", "성명", "직무", "급여", "부서");
		System.out.println("  -----------------------------------------");
		while (rs.next()) {
				System.out.printf("%10s%10s%10s원%10d\n", 
						rs.getString("ename"), rs.getString("job"), 
						rs.getString("sal"), rs.getInt("deptno"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
