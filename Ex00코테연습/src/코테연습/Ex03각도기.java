package 코테연습;

import java.util.Scanner;

public class Ex03각도기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int angle = sc.nextInt();
		if(angle >0 && angle <90) {
			System.out.println("예각");
		}
		else if(angle == 90) {
			System.out.println("직각");
		}
		else if(angle >90 && angle < 180) {
			System.out.println("둔각");
		}
		else if(angle ==180) {
			System.out.println("평각");
		}

	}

}
