package 코테연습;

import java.util.Scanner;

public class Ex01세균증식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간 : ");
		int t = sc.nextInt();
		System.out.println("세균의 수: ");
		int n = sc.nextInt();
		int nt = n;
		
		for (int i=t; i>0; i--) {
			nt *= 2; //nt = nt * 2
		}
		System.out.println("증식한 세균 수 : " + nt);
		
		

	}

}
