package while문;

import java.util.Scanner;

public class Ex02While문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		int sum =0;
		while(input != -1) {
			System.out.print("정수 입력 : ");
			input= sc.nextInt();
			System.out.println("누적 결과 : " +(sum += input));
		}
		System.out.println("종료되었습니다.");
	}

}
