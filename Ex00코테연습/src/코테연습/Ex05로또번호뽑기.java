package 코테연습;

import java.util.Random;

public class Ex05로또번호뽑기 {

	public static void main(String[] args) {
		Random ran = new Random();
		int num1 = ran.nextInt(45) + 1;
		int num2 = ran.nextInt(45) + 1;
		int num3 = ran.nextInt(45) + 1;
		int num4 = ran.nextInt(45) + 1;
		int num5 = ran.nextInt(45) + 1;
		int num6 = ran.nextInt(45) + 1;
		System.out.print(num1 + " " + num2+ " " + num3+ " " + num4+ " " + num5+ " " + num6);
	}
}
