package 단항이항연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("결과 값 : "+((num/100)*100));
		
	}
	
}