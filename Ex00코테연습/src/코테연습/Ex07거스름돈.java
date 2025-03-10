package 코테연습;

import java.util.Scanner;

public class Ex07거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		int money = sc.nextInt();
		System.out.print("잔돈 : " + money + "원\n");
		int a = money / 10000;
		int b = money % 10000 / 5000;
		int c = money % 10000 % 5000 /1000;
		int d = money % 10000 % 5000 % 1000 / 500;
		int f = money % 10000 % 5000 % 1000 % 500/ 100;
		System.out.println("10000원 :"+ a+"개");
		System.out.println("5000원 :" + b+"개");
		System.out.println("1000원 :" + c+"개");
		System.out.println("500원 :" + d+"개");
		System.out.println("100원 :" + f+"개");
	}

}
