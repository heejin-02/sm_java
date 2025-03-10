package 코테연습;

import java.util.Scanner;

public class Ex02개미군단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hp = sc.nextInt();
		int ant_king = hp/5; //장군 4
		int ant_sol =  (hp%5)/3; //병정 1
		int ant_com = (hp%5)%3; //일
		
		int ant = ant_king+ant_sol+ant_com;

		System.out.println(ant);
		
		
	}
}
