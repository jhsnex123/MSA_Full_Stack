//package jdbcexam.exam1;
//
//public class SelectEmpLab {
//
//	public static void main(String[] args) {
//	//ResultSet rs =null;
//		if(new Random().nextBoolean()) {
//			rs = stmt.executeQuery("SELECT ename, FORMAT(sal,0) SAL FROM emp");
//			while(rs.next()) {
//				System.out.println(rs.getString("ename")+"직원의 월급은"
//						+rs.getString("SAL")+ "달러입니다.");
//			}
//		}else {
//			rs = stmt.executeQuery("SELECT ename, ", 
//					+ DATE_FORMAT(hiredate, '%Y년 %m월 %d일') hd FROM emp ORDER BY hd");
//		}
//	}
//
//}



