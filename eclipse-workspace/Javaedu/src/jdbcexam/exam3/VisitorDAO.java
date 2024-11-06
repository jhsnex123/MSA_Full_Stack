package jdbcexam.exam3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VisitorDAO {
	public boolean c(VisitorDTO dto) { // VisitorDTO ->새로운 방명록 글을 삽입하는 애
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn
				.prepareStatement("insert into visitor (name, writedate, memo) values (?, now(), ?)")) {	  // now는 절대값이기 때문에 따로 set값을 세팅할 필요가 없음
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMemo());
			pstmt.executeUpdate();		
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}

	public List<VisitorDTO> r() {
		Connection conn = MySQLConnUtil.connect();
		List<VisitorDTO> vlist = null;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(
					"select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor order by writedate desc");
			vlist = new ArrayList<VisitorDTO>(); // array , link 둘 다 자식 부모는 object(최상위)?
			while (rs.next()) {
				VisitorDTO vo = new VisitorDTO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setMemo(rs.getString("memo"));
				vlist.add(vo);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn); // 스테틱형이라 가져다 쓰면됨 다른 객체들이 다 사용가능
		return vlist; // dto값이 vlist로 리턴됨
	}
	public boolean u(VisitorDTO dto) {
		boolean result = false; // result 리턴false값
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("update visitor set name = ?,  memo = ? where id = ?")) {			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMemo());
			pstmt.setInt(3, dto.getId());
			pstmt.executeUpdate();		
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}

	public boolean d(int id) {
		boolean result = false;// result 리턴 false값
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("delete from visitor where id = ?")) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}
}
