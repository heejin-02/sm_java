package 이중for문;

import java.util.Scanner;

public class Ex03역별찍기 {

	public static void main(String[] args) {

		

		for (int j = 0; j <= 5; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// *
		// **
		// ***
		// ****
		// *****
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	
	}
}
