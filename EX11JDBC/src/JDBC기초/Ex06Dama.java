package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex06Dama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DB 드라이버 로드

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB연결에 필요한 설정값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		String name = null;
		String food = null;
		while (true) {
			System.out.println("메뉴 [1] 다마고치 생성 [2] 다마고치 키우기 >>>");
			int select = sc.nextInt();

			if (select == 1) { // 다마고치 생성
				// 다마고치 생성
				// 사용자에게 이름 입력받기, 좋아하는 음식 입력받기
				// 다마고치의 배고픔 수치, 졸림 수치는 무조건 30으로 (사용자 입력x)
				System.out.print("사용자 이름 입력 : ");
				name = sc.next();
				System.out.print("좋아하는 음식 입력 : ");
				food = sc.next();

				// 1. DB 작업
				try {
					//작업할때마다 커넥션 생성
					conn = DriverManager.getConnection(url, user, password);

					// 다마고치 생성 정보
					String sql = "INSERT INTO DAMA VALUES(?,?,30,30)";
					psmt = conn.prepareStatement(sql);

					// ? 채우기
					psmt.setString(1, name);
					psmt.setString(2, food);

					// sql 실행
					int result = psmt.executeUpdate();

					if (result > 0) {
						System.out.println("다마고치 생성 성공");
					} else {
						System.out.println("다마고치 생성 실패");
					}

				} catch (SQLException e) {

					e.printStackTrace();
				}

			} else if (select == 2) { // 키우기
				System.out.println("메뉴 [1]상태확인 [2] 밥주기 [3] 재우기 ");
				int select2 = sc.nextInt();

				// 상태확인 선택
				if (select2 == 1) {

					// 내가 만든 모든 다마고치의 상태를 볼 수 있게
					try {
						conn = DriverManager.getConnection(url, user, password);
						String sql = "SELECT * FROM DAMA";
						psmt = conn.prepareStatement(sql);
						rs = psmt.executeQuery();
						System.out.println("========== 전체 다마고치 조회 ==========");
						System.out.println("이름"+"\t"+"음식"+"\t"+"배고픔"+"\t"+"졸림");
						while (rs.next()) {
							System.out.print(rs.getString("NAME") + "\t");
							System.out.print(rs.getString("FOOD") + "\t");
							System.out.print(rs.getInt("HUNGRY") + "\t");
							System.out.println(rs.getInt("SLEEPY") + "\t");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();

					}

				} else if (select2 ==2) { // 밥주기 선택
					// 1. 다마고치의 이름과, 어떤 음식을 줄지를 작성받기
					System.out.print("음식을 줄 다마고치 이름을 입력하세요 : ");
					name = sc.next();
					System.out.print("어떤 음식을 줄 지 입력하세요 : ");
					food = sc.next();
					try {
						conn = DriverManager.getConnection(url, user, password);
						
						// 2. 1에서 입력한 이름이 있는지 검사
						String sql = "UPDATE DAMA SET HUNGRY = HUNGRY-5  WHERE NAME = ?";
						psmt = conn.prepareStatement(sql);
						psmt.setString(1, name);

						int feedResult = psmt.executeUpdate();
						
						if (feedResult > 0) {
							System.out.println(name + "에게 " + food + "를 줬습니다!");
						}
						else {
							System.out.println("밥 주기 실패");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//3. 밥 주기 완료. 배고픔을 -5 시키기(심화)
					
				}
			}
		}
	
	}
}
