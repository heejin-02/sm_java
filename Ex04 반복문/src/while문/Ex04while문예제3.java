package while문;

import java.util.Scanner;

public class Ex04while문예제3 {
	public static void main(String[] args) {
//		 [예제3]
//		1. 사용자에게 현재 몸무게, 목표 몸무게를 입력받아 저장
//		2. 주차별 감량 몸무게를 계속 입력받기
//		3. 종료 조건 : 몸무게가 목표 이하가 되었을 때 -> 종료 후 축하합니다 출력하기
		
		Scanner sc = new Scanner(System.in);
		int week =0;
		int kg = 0;
		System.out.print("현재 몸무게 : ");
		int now_kg = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal_kg = sc.nextInt();
		while (now_kg > goal_kg) {
			System.out.print((week+=1)+"주차 감량 몸무게 : ");
			kg = sc.nextInt();
			now_kg -= kg;
		}
		System.out.println((now_kg) + "kg 달성!! 축하합니다!");
	

	}
}
