package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자로부터 아이디와 비밀번호 입력받기
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// sql문 준비
			// 로그인 >> 테이블에 데이터가 존재하는지 확인 >> select
			// 아이디, 비밀번호가 일치하는 데이터의 모든 컬럼을 가져오기
			String sql = "SELECT * FROM DATADESIGNMEMBER WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			// ? 인자 채워주기
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// sql문 실행
			rs = psmt.executeQuery();
			// ResultSet이란?
			// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조
			// : cursor를 가지고 있다(처음에는 column명을 가리키고 있음)
			// : cursor가 가리키고 있는 데이터만 가져올 수 있다.

			// rs.next(); ---> cursor를 한 행 밑으로 내리는 작업
			if (rs.next() == true) { // rs.next() 자체가 boolean 타입이라 rs.next() 라고만 적어도됨.
				// 로그인 성공
				// 이름 님 환영합니다 출력
				String uName = rs.getString("name"); // 찾고자 하는 컬럼명 uName 변수를 만들어 이름을 받아준다
				System.out.println(uName + "님 환영합니다~");

			} else {
				System.out.println("로그인이 실패했습니다..");
				System.out.println("아이디와 비밀번호를 확인해보세요.");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 열어준 순서 반대로 자원 반납하기
			try {
				if (rs != null)
					rs.close();
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
