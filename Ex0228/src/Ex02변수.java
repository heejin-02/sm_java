
public class Ex02변수 {

	public static void main(String[] args) {
		// 변수 : 변할 수 있는 수(변하는 데이터를 담을 수 있는 공간)
		// 정수형태의 데이터를 담을 수 있는 변수를 선언하고(int)
		// 만들어진 변수 이름을 num으로 부르겠습니다
		// Java 변수는 같은 이름으로 여러번 변수 생성할 수 없다
		
//		int num;
//		num = 10;
		int num = 10;
		System.out.println(num+3);
		
		//30 새로운 변수에 담기
		int number = 30;
		// number 값을 100으로 바꾸기
		number = 100;
		
		//String : 문자열
		// " " : 문자열 데이터 사용+
		// ' ' : 문자 데이터 사용
		
		String name; // reference 타입
		name = "승환";
		// 맞는 타입만 값에 넣을 수 있다.
		//name =30; <- 안됨
		
		// final : 상수(변하지 않는 데이터) 사용
		final int age = 20; // 앞에 final을 붙여주면 값을 절대 바꿀 수 없다. : 상수
		//age = 22;
		
		//논리 타입 : boolean (true or false)
		boolean b = false;
		
		// 문자 타입 : char
		char c = 'a';
		System.out.println(c+1); // a = 아스키코드 97 + 1 = 98 출력
		
		// 실수 타입 : float, double
		double d = 3.14;
		float f = 5.67f;
		
		
		
	}

}
