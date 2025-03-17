package View;

import java.util.Scanner;

import Controller.Controller;

public class Main {

	public static void main(String[] args) {
		// [View]
		
		//MVC패턴
		//View : 사용자에게 시각적으로 보여줄 수 있는 역할
		//Controller : 사용자의 요청을 전처리해서, Model/View에 전달하는 다리 역할
		//Model : 데이터 처리, 데이터 베이스 관련된 기능 역할
		
		//MVC 패턴의 장점 : 확장이 용이, 유지보수 편리
		
		//실행 순서
//		1. 사용자 요청 발생(뷰)
//		2. 뷰 -> 컨트롤러 요청 전달
//		3. 컨트롤러 -> 모델 로직실행 요청
//		4. 모델 -> 컨트롤러 (응답 데이터 전달)
//		5. 컨트롤러 -> 뷰(사용자에게 표시할 데이터)
		Scanner sc = new Scanner(System.in);
		
		// 컨트롤러 객체 생성
		Controller control = new Controller();
		
		System.out.print("메뉴 선택 >> ");
		int input = sc.nextInt();
		
		if(input == 1) {
			System.out.println("== 회원가입 ==");
			System.out.println("ID 입력 : ");
			String id = sc.next();
			System.out.println("PW 입력 : ");
			String pw = sc.next();
			System.out.println("이름 입력 : ");
			String name = sc.next();
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
		
			// controller에 필요한 정보를 담아서, 로직을 수행하게끔 
			// Model이 로직을 수행하게끔
			control.Con_join(id, pw, name, age);
		}
		
	}

}
