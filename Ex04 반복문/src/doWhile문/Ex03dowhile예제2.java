package doWhile문;

import java.util.Scanner;

public class Ex03dowhile예제2 {

	public static void main(String[] args) {

		String id = "test";
		String pw = "test1234";
		int count = 0; // 로그인 실패 횟수
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("아이디 >>");
			String UserId = sc.next();
			System.out.print("비밀번호 >> ");
			String UserPw = sc.next();
			if (id.equals(UserId) && pw.equals(UserPw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				count++; //로그인이 실패될때마다 카운트를 ++;
				if (count ==3) {
					System.out.println("3번 이상 틀렸습니다.");
					break;
				}
			}
		} while (true);
	}
}
