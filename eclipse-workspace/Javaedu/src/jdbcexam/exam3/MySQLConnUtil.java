package jdbcexam.exam3;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnUtil {  
	public static Connection connect() {// static형이라 따로 객체 생성없이 가져다 쓰면 됨
		Connection conn = null;
		try {		
			String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "jdbctest";
			String passwd = "jdbctest";
			conn = DriverManager.getConnection(url, user, passwd); //conn에다가 콜렉션 값을 대입해서 초기화 된 null값이 바뀜		
		} catch (Exception e) {
			System.out.println("MYSQL 연결 실패");
			System.out.print("사유 : " + e.getMessage());
		}
		return conn;
	}
	public static void close(Connection conn) { // 애도 스테틱이라 가져다 쓰면딤
		try {
			if (conn != null)      // null값이 아니기 떄문에 트루가 되어서
				conn.close();      // close값이 됨
		} catch (Exception e) {
			System.out.println("MYSQL 닫기 실패");
			System.out.print("사유 : " + e.getMessage());
		}
	}
}