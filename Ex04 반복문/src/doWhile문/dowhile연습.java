package doWhile문;

import java.util.Random;
import java.util.Scanner;

public class dowhile연습 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Random ran = new Random();
	        int answer = ran.nextInt(10) + 1; // 1~10 사이 랜덤 숫자
	        int count = 0; // 실패 횟수

	        do {
	            System.out.print("무슨 숫자일까요? : ");
	            int user_answer = sc.nextInt(); // 사용자 입력
	            
	            if (answer == user_answer) {
	                System.out.println("정답입니다!");
	                break;
	            } else if (answer > user_answer) {
	                System.out.println("더 큰 수를 입력하세요");
	            } else {
	                System.out.println("더 작은 수를 입력하세요");
	            }
	            
	            count++; // 실패 횟수 증가 (조건과 상관없이 공통적으로 처리)

	            if (count >= 5) {
	                System.out.println("게임 종료! 정답은 " + answer + "였습니다.");
	                break;
	            }
	        } while (true);
	        
	        sc.close(); // Scanner 닫기
	}
}

