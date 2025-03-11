package 클래스객체기초;

public class PersonMain {

	public static void main(String[] args) {
		// 설계도(클래스)를 기반으로 객체를 만들어보자!
		
		//객체 생성
		//설계도명 객체명 = new 설계도명();
		//** 객체 생성 시 붙는 ()는 생성자 메소드
		Person miri = new Person();
		
		//객체 데이터 할당(age,name) - 속성
		miri.age = 20;
		miri.name = "미리";
		
		//객체가 가진 데이터 출력해보기
		System.out.println(miri.age);
		miri.sleep();
		miri.introduce();
		miri.eat("치킨");

		//person 설계도를 기반으로 새로운 사람 만들어보기
		Person heejin = new Person();
		heejin.age = 24;
		heejin.name = "희진";
		
		heejin.introduce();
		heejin.eat("햄버거");
		heejin.sleep();
		
		
	}

}
