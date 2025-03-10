package for문;

import java.util.Scanner;

public class Ex02for문예제 {

	public static void main(String[] args) {
//		// 구구단 2단
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("2" + "*" + i + "=" + (2 * i));
//		}
//		System.out.println();
//
//		// 1-2+3-4+5...+99-100 계산하여 답을 출력
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.print(-i + " ");
//				sum += (-i);
//			} else {
//				System.out.print(i + " ");
//				sum += i;
//			}
//		}
//		System.out.println("\n결과 : " + 
//		sum);

		// 구구단 원하는 단 입력받아 출력
		Scanner sc = new Scanner(System.in);
//		System.out.print("단 입력 >>");
//		int dan = sc.nextInt();
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan*i));
//		}
		// 반복횟수까지 입력받기
		System.out.print("단 입력 >>");
		int dan = sc.nextInt();
		System.out.print("어느 수 까지 출력 >>");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

	}
}
