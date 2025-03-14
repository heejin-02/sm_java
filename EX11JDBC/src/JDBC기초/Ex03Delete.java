package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {
		//1. 사용자에게 id,pw 입력받기
		//2.회원탈퇴 성공 --> 출력 ==> 일치하는 행을 찾아서 삭제
		//	회원탈퇴 실패 --> 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 탈퇴 할 아이디와 비밀번호를 입력하세요.");
		System.out.println("ID 입력 : ");
		String id = sc.next();
		System.out.println("PW 입력 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			//연결 확인 용
//			if (conn != null) {
//				System.out.println("연결 성공");
//			} else {
//				System.out.println("연결 실패");
//			}
			
			String sql = "DELETE FROM DATADESIGNMEMBER WHERE ID =? AND PW = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
		
			int row = psmt.executeUpdate();
			
			if(row > 0 ) {
				System.out.println("회원 탈퇴 성공");
			}
			else {
				System.out.println("회원 탈퇴를 실패했습니다.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 열어준 순서 반대로 자원 반납하기
			try {
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
