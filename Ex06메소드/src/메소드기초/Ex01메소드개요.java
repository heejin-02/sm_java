package 메소드기초;

public class Ex01메소드개요 {

	public static void main(String[] args) {
		// 메소드?
		// 계속 꺼내서 쓸 코드의 묶음을 만든다.
		
		// 메소드의 장점
		// 코드 재사용 가능
		// 유지 보수가 편리해진다. 
		
		// 메소드를 사용하는 법
		// 1. 메소드 이름();

		// 메소드를 만드는 법
		// 1. 우리가 지금 주석을 쓰는 공간은 메인 메소드 안이다.
		// 		(메인 메소드 : 코드의 시작점)
		// 		메소드 안에 메소드를 만드는 건 불가능하다.
		// 		-> 메인메소드 바깥에 추가 메소드를 만들어야한다.
		
		//메소드 사용
		introduce();
		
		//매개변수가 있는 메소드 사용
		//-메소드를 정의해둔 곳과 똑같이 매개변수의 갯수와 순서를 맞춰야 함
		cook(1,"진라면");
		cook(4, "짜파게티");
		//반환값이 있는 메소드 사용
		//- 반환값으로 변한 메소드 구문을 값으로서 취급이 가능
		// ==> 메소드를 변수에 담을 수도 있고, 출력도 할 수 있다.
		int result = age();
		System.out.println(age());
		
		System.out.println("1 더하기 4는 " + sum(1,4));
		
	}
	
	//메소드 생성(매개변수X, 반환값X)
	public static void introduce() {
		System.out.println("이름 : 희진 ");
		System.out.println("나이 : 24");
		System.out.println("취미 : 게임");
	}
	
	// 메소드 생성(매개변수O, 반환값X)
	// 매개변수는 소괄호 안쪽에 작성
	// 여러 매개변수를 넣을 수 있음
	// 매개변수의 이름은 메소드 안에서 부를 별명
	public static void cook(int a, String b) {
		System.out.println(b+ "을(를) " + a + "개 끓입니다");
	}
	//메소드 생성(매개변수X, 반환값O)
	public static int age() {
		System.out.println("age 메소드 실행");
		return 20;
	}
	
	//메소드 생성(매개변수O, 반환값O)
	//-숫자 두개를 매개변수로 받아서, 덧셈 결과를 리턴하는 메소드
	public static int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	
}
