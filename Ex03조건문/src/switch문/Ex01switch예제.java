package switch문;

import java.util.Scanner;

public class Ex01switch예제 {

	public static void main(String[] args) {
		//switch문
		//어떤 값과 '일치'하는지를 조건으로 삼을 수 있는 조건문 (boolean이 아님)
		//각각의 case마다 꼭 break를 넣어주기
		
		//문법
//		switch(boolean이 아닌 식이나 데이터) {
//		case 값1 :
//			실행문1
//			break;
//		case 값2 :
//			실행문2
//			break;
//		}
//		default :
//			모든 case에 다 맞지 않을 경우(else)
//	}
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		if(month > 12 || month <1) {
			System.out.println("잘못된 숫자 입니다.");
			}
		else {
			switch(month) {
			case 3, 4, 5:
				System.out.println(month+"월은 봄 입니다.");
				break;
			case 6,7,8:
				System.out.println(month+"월은 여름 입니다.");
				break;
			case 9,10,11:
				System.out.println(month+"월은 가을 입니다.");
				break;
			case 12,1,2:
				System.out.println(month+"월은 겨울 입니다.");
				break;
			}
		}
	}
}

	

