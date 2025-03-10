package ifelse문;

import java.util.Scanner;

public class Ex02ifelse예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("===== EVERLAND RESORT =====\n");
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요: ");
		int member = sc.nextInt();
		int price = (5000*member);
		
		if (age>=20) {
			System.out.println("총 "+price+"원 입니다.");
		}
		else {
			System.out.println("총 "+(price/2)+"원 입니다.");
		}
		
	}

}
