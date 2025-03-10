package 이중for문;

import java.util.Scanner;

public class Ex04별찍기응용 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		// 행 개수 입력받고 역별찍기
//		System.out.println("행 개수 >>");
//		int n = sc.nextInt();
//		for (int j = 0; j < n; j++) {
//			for (int i = n; i > j; i--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < 5; i++) {
			for (int s = 0; s < 5 - i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
