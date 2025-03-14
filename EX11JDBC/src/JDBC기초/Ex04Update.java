package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Update {

	public static void main(String[] args) {
		// id, pw 수정할 점수
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 회원 정보 수정 ==========");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("수정할 점수 입력 : ");
		int score = sc.nextInt();
		
		
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			
			String sql = "UPDATE DATADESIGNMEMBER SET SCORE = ? WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, score);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			
		
			int row = psmt.executeUpdate();

			if(row > 0 ) {
				System.out.println("점수 수정 성공");
			}
			else {
				System.out.println("점수 수정 실패");
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
