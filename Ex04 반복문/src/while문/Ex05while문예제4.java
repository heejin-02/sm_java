package while문;

import java.util.Scanner;

public class Ex05while문예제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A 입력 >>");
		int a = sc.nextInt();
		System.out.print("B 입력 >> ");
		int b = sc.nextInt();
		while(a != 0 || b != 0) {
			System.out.println("결과 >> " + (a-b));
			System.out.print("A 입력 >>");
			a = sc.nextInt();
			System.out.print("B 입력 >>");
			b = sc.nextInt();
		}
		System.out.println("종료");
	}

}
