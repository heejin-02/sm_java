package 상속기초;

public class Main {

	public static void main(String[] args) {
		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();
		
		//2. child 자료형 c 객체 생성
		Child c = new Child();
		
		p.makeBibim();
 		c.makeBibim(); // 상속받은 내용을 가지고 있는걸 확인할 수 있다.
 		
		

	}

}
