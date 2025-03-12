package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		//1. Student 자료형을 보관할 수 있는 sList 라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();

		//2. 데이터 추가(본인 이름, 나이를 가지고 있는 데이터 추가)
		//Student s1 = new Student("오희진",24);
		//sList.add(s1); s1이 중복되므로 바로 넣어줘도된다.
		sList.add(new Student("오희진",24));
		
		//이름 출력
		//System.out.println(sList.get(0));  주소값만 나오므로 더 접근하여 출력해야함.
		System.out.println(sList.get(0).getName());
		System.out.println(sList.get(0).getAge());
		//본질적으로 어떤 자료형인지 확인할 것!!
		//sList.get(0) ---> return type : Student ---> 객체!
		
		//4. 팀원들의 데이터 전부 추가하기
		sList.add(new Student("김혜림",27));
		sList.add(new Student("나규민",27));
		sList.add(new Student("전정훈",25));
		
		//5. 팀원 이름, 나이 전부 출력 => for-each문 사용해보기
		System.out.println("===== 팀원 정보 =====");
		System.out.println("이름\t나이");
		for(Student s :sList) {
			System.out.println(s.getName() + "\t" + s.getAge());
		}
	}

}
