package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		//1. Student 자료형을 보관할 수 있는 sList 라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();

		//2. 데이터 추가(본인 이름, 나이를 가지고 있는 데이터 추가)
		sList.add(new Student("오희진",24));
	}

}
