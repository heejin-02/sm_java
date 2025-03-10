
public class Ex03연산자 {

	public static void main(String[] args) {
		// 산술 연산자
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		//더 많은 정보를 표현할 수 있는 타입으로
		// 자동(묵시적)형변환이 일어남 
		float num3 = 3.45f;
		System.out.println(num1+num3); // type : 실수
		
		//숫자 + 문자열 --> 두개의 데이터가 붙여서 출력
		String number = "10";
		System.out.println(num1+number); // type : 문자열
		
		System.out.println(""+num1+num2);
		
		System.out.println("===================================");
		int num = 111;
		System.out.println("결과확인 :"+(num/100)*100);
	}

}
