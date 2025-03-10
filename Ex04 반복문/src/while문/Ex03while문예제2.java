package while문;

import java.util.Scanner;

public class Ex03while문예제2 {

	public static void main(String[] args) {
		//[예제2]
		// 사용자의 입력값에서 홀수,짝수 갯수를 세는 프로그램
		// -1 입력시 프로그램 종료
		// 입력값을 판별 >> 홀수면 홀수 카운트 +1 , 짝수라면 짝수 카은트 +1
		// --> 홀수 셀수 있는 상자, 짝수 셀 수 있는 상자 필요
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		int num = 0;
		while(num !=-1) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if (num % 2 ==0) {
				even++;
				System.out.println("홀수 개수: " + odd );
				System.out.println("짝수 개수 : " +even);
			}
			else if (num != -1) {
				odd++;
				System.out.println("홀수 개수: " + odd );
				System.out.println("짝수 개수: " + even );
			}
		}
		System.out.println("종료되었습니다.");

	}

}
