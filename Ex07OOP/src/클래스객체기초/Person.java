package 클래스객체기초;

public class Person {
	
	// Person 이라고 하는 이름의 클래스(설계도)
	// 사람이 가질 수 있는 데이터와 로직을 설계
	
	//데이터
	int age;
	String name;
	
	// 로직
	void sleep() {
		System.out.println("잠을 자요");
	}
	
	void introduce() {
		//같은 클래스 내의 변수 사용 가능
		System.out.println("제 이름은 " + name + "이고 " + age + "살 입니다");
	}
	
	void eat(String food) {
		//매개변수 받아와서 실행 가능
		System.out.println(name + " 이(가) " + food + "을(를) 먹습니다");
	}
	
	
}
