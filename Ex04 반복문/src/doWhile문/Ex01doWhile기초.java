package doWhile문;

import java.util.Scanner;

public class Ex01doWhile기초 {

	public static void main(String[] args) {
		// do-while문
		// while의 조건을 검사하기 전에, 무조건 한 번은
		// 실행구문을 실행시켜주는 반복문

		// --> 검사 조건이 false여도 한번은 실행된다.
		// do {로직} while (조건);

		int a = 3;
		do {
			System.out.println("a는 0이다");
		} while (a == 0);
		{
		}
	// 몸무게 감량 문제 다시 풀어보기
	Scanner sc = new Scanner(System.in);
	int goal = sc.nextInt();
	int now = sc.nextInt();
	
	do {
		int kg = sc.nextInt(); //이번주 감량 몸무게
		now = now-kg;
	}while(now >= goal);
	System.out.println("종료");

	
	//무한 반복문
	//while 조건을 무조건 참이 되게 만들때
	//무한 반복문을 멈추고 싶을 때 
	// => 내부에 조건을 걸어서, 조건에 해당될 때 break; 
   /* int b = 0;
    
    while(true) {
       System.out.println(b++);
       
       if(b==50) {
          break;
       }
    }*/
	
	
	}	
}