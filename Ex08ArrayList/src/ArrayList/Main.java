package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//ArrayList
		// : 크기가 가변적인 배열과 같은 형태를 가진 **클래스**
		
		// 1. ArrayList 생성
		//: 레퍼런스 타입의 데이터만 저장할 수 있다.
		//ex) String, Pokemon, Student
		ArrayList<String> list = new ArrayList<String>(); // 생성자이면서-> 메소드이면서 -> 클래스이다
		
		// 2. 데이터 추가하기 : 데이터 맨뒤에 계속 달라붙어 추가된다.
		list.add("이도연"); //0번
		list.add("주미리"); //1번
		list.add("신재영"); //2번
		
		// 3. 데이터 가져오기
		System.out.println(list.get(1)); // 1번 데이터를 가져온다
		
		// 4. 데이터 특정 위치에 추가하기
		list.add(2,"임승환"); //기존 있던 2번 데이터는 뒤로 밀려나고, 2번 인덱스에 데이터가 들어감
		System.out.println(list.get(2)); // "임승환"
		System.out.println(list.get(3)); // "신재영"
		
		//5. 데이터 삭제하기
		list.remove(2); //2번 데이터 삭제 -> 데이터 삭제 시 그만큼 앞으로 따라붙음
		System.out.println(list.get(2)); //3번에 있던 데이터가 앞으로 들어가 2번에 들어갔다.
		
		//6. 데이터 크기 알아보기
		System.out.println("list의 크기 : " + list.size());
		
		//7. 데이터 전체 삭제하기
		list.clear();
		System.out.println("clear 사용 후 list의 크기 : " + list.size());
		
	}

}
