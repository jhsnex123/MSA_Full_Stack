package jdbcexam.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcexam.exam3.MySQLConnUtil;



public class StudentDAO {

	public boolean insertStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = jdbcexam.exam3.MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("insert into student (name, score) values (?, ?)")) { 

			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getScore());
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}

	public List<StudentDTO> getAllStudent() {
		Connection conn = jdbcexam.exam3.MySQLConnUtil.connect();
		List<StudentDTO> getScore = null;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(
					"select  name, score from student order by score desc");
			getScore = new ArrayList<StudentDTO>(); 
			while (rs.next()) {
				StudentDTO inf = new StudentDTO();
				
				inf.setName(rs.getString("name"));
				inf.setScore(rs.getInt("score"));
				getScore.add(inf);
	}
}catch (SQLException se) {
	System.out.println(se.getMessage());
}
MySQLConnUtil.close(conn); // 스테틱형이라 가져다 쓰면됨 다른 객체들이 다 사용가능
return getScore; // 애 보류
}
}