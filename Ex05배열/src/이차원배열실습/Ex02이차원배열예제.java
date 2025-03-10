package 이차원배열실습;

import java.util.Scanner;

public class Ex02이차원배열예제 {

	public static void main(String[] args) {
		// 1.이차원 배열 array를 만들기 (3행 3열)
		int[][] array = new int[3][3];
		int cnt = 1; // 배열 안에 넣을 카운트용 숫자
		// 2.array의 값을 이중for문 이용해서 할당
		for (int i = 0; i < array.length; i++) { //열
			for (int j = 0; j < array[i].length; j++) { //행
				// 내가 속한 i의 행의 길이만큼 반복하면서,
				// 열을 반복 출력하는 for문
				array[i][j] = cnt++;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

//정수 N입력받아 N*N 배열에 다음과 같이 숫자를 저장하고 출력하시오.		
//		 array2[0][0] = 1;
//		 array2[0][1] = 2;
//		 array2[0][2] = 3;
//		 array2[0][3] = 4;
//		 array2[0][4] = 5;
//		 array2[1][0] = 6;
//		 array2[2][0] = 11;
		
		int cnt2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하시오 : ");
		int n = sc.nextInt();
		int[][] array2 = new int[n][n];
		// 저장 (열 고정 행 반복)
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) { 
				array2[j][i] = cnt2++;
			}
		}
		// 출력
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		int[][] array3 = new int[5][5];
		int cnt3 = 1; // 배열 안에 넣을 카운트용 숫자
		// 2.array의 값을 이중for문 이용해서 할당
		System.out.println("원본");
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = cnt3++;
				System.out.print(array3[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("90도 회전");
		for (int i=4; i>=0; i--) {
			for (int j=0; j<=4; j++) {
				System.out.print(array3[j][i] + "\t");
			}
			System.out.println();
		}
//		[0][5]; [1][5];
//		[0][4]; [1][4];
//		[0][3];	[1][3];	


		
		

	}
}
