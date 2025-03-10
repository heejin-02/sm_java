package 다중if문;

import java.util.Scanner;

public class Ex01다중if예제 {

	public static void main(String[] args) {
	      // 다중if문
	      
	      //   if(조건1) {
	      //      조건1이 참일때
	      //   } else if(조건2) {
	      //    조건 2가 참일때  
	      //  } else if(조건3) {
	      //    조건 3이 참일때 
	      //  } else {
	      //    조건 1~3 다 거짓일때 
	      //  }
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("A"+"학점 입니다.");
		}
		else if (score>=80) {
			System.out.println("B"+"학점 입니다.");
		}
		else if (score>=70) {
			System.out.println("C"+"학점 입니다.");
		}
		else {
			System.out.println("D"+"학점 입니다.");
		}
		
		
	}

}
