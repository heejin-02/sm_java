package 코테연습;

import java.util.Scanner;

public class Ex08팩토리얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력");
		int a = sc.nextInt();
		int b=1;
		
		for(int i=2; i<=a; i++) {
			b *= i;
		}
		
		System.out.print("출력" + b);
	}

}
