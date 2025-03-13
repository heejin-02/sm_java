package 상속기초;

public class Main {

	public static void main(String[] args) {
		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();
		
		//2. child 자료형 c 객체 생성
		Child c = new Child();
		
		p.makeBibim();
 		c.makeBibim(); // 상속받은 내용을 가지고 있는걸 확인할 수 있다.
 		c.makeBul();
		
 		//상속의 특징 3가지
 		//1. 다중 상속이 불가능하다.
 		//2. 상속의 횟수에 제한이 없다.
 		//3. 모든 클래스는 Object(최상위클래스)를 상속받는다.
 		//----> Object == 클래스 공통의 조상
 		
 		
// 		객체의 Casting(형변환)
// 		Reference Type 에서의 형변환은 반드시 상속이 전제되어 있어야 한다.
// 		 --> 객체 내 필드, 메소드의 접근권한을 기준으로 강제 vs 자동 결정
// 		
// 		1) UpCasting(업캐스팅)
// 		: 자식클래스가 부모 클래스 타입으로
// 		 자동으로 형변환 하는 것
// 		 ex) 강아지는 동물이다 --> 말 됨! 자동으로 형변환 
// 		     모든 동물은 강아지다 --> 말 안됨!
// 		1) UpCasting(업캐스팅)
// 		: 자식클래스가 부모 클래스 타입으로
// 		 자동으로 형변환 하는 것
// 		 ex) 강아지는 동물이다 --> 말 됨! 자동으로 형변환 
// 		     모든 동물은 강아지다 --> 말 안됨!
 		
 		Parent p2 = new Child();
 		// 부모 자료형 레퍼런스 변수명 = new 자식자료형();

 		p2.makeBibim(); 
 		
 		// 2) Down Casting(다운캐스팅)
 		//Child c2 = (Child) new Parent(); 
 		//코드에서 빨간줄이 뜬다 == Syntax Error (구문오류)
 		//Exception 발생!!
 		// : 구문 오류는 없지만 실행했을 때 예외상황이 발생하는 것
 		                                          
 		// 3)진짜 다운캐스팅
 		// : 업캐스팅 된 객체를 강제 형변환으로 본래의 자료 형태를 되돌려 놓는 것
 		// 전제조건 : 업캐스팅 된 객체를 다운캐스팅 할 수 있다!
 		Child c2 = (Child)p2;
 		c2.makeBul();
 		
 		
 		
 		
	}

}
