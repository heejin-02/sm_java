package 코테연습;

import java.util.Scanner;

public class Ex04만나이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("일: ");
		int day = sc.nextInt();
		int age =2025 - year;
		if (month > 3 || (month == 3 && day > 6)) {
            age -= 1;
        }
		System.out.println("만"+age+"세");
		

	}

}
