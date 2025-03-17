package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	//[DAO]
	//-> Database Access Object (DB에 접근하기 위한 객체)
	Connection conn = null;
	PreparedStatement psmt = null;
	int result = 0; //결과를 저장
	
	public void getConn() { //DB 접속 메소드
		  try {
			  // getConn
			  // - 드라이버 로딩, url/user/pw로 DB접속
		         Class.forName("oracle.jdbc.driver.OracleDriver");

		         // DB연결에 필요한 설정값
		         String url = "jdbc:oracle:thin:@localhost:1521:xe";
		         String user = "hr";
		         String password = "hr";

		         conn = DriverManager.getConnection(url, user, password);
		      } catch (SQLException | ClassNotFoundException e) {
		         e.printStackTrace();
		      }
	}
	
	public void Close() { // 객체를 반납할 수 있는 메소드
		try {
			if(psmt != null) {
				psmt.close();
			}
			if(conn!= null) {
				psmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int join(MemberDTO dto) { //회원가입 쿼리 메소드
		// DB접근
		getConn();
		
		// DB쿼리문 실행
		String sql = "INSERT INTO DATADESIGNMEMBER VALUES(?,?,?,?,0)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			result = psmt.executeUpdate(); //실행
			
			if(result > 0) {
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Close(); // 도구 반납
		}
		
		return result;
		
	}
}
