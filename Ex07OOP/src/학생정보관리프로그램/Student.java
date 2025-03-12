package 학생정보관리프로그램;

public class Student {
	// 1. 필드 생성
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	//생성자(constructor) - 메소드
	//--> 객체를 생성하는 순간에 실행되는 메소드
	//--> 필드에 있는 데이터를 객체를 생성하는 순간에 초기값을 지정
	public Student(String name, String number, int age) {
		this.name = name; //this 내가 가지고 있는 name이라는 필드에 접근하여 name값을 넣어줌(나 자신을 의미)
		this.number = number;
		this.age = age;
		}
	//	생성자 특징
	//	1. 리턴 타입을 지정조차 하지 않는다.(void도 작성안함)
	//	2. 생성자의 이름은 클래스 이름과 동일해야 한다.(대소문자까지)
	//	3. 생성자도 결국 메소드이다.
	//	4. 매개변수가 아무것도 없는 생성자를 기본 생성자(default constructor)라고 부르는데, 생략 가능하다.
	//	단, 새로운 나만의 생성자를 만들게되면 기본 생성자는 덮어씌워진다(사라진다)
	//	5. 생성자도 오버로딩(중복정의) 가능하다
	public Student() {
		// TODO Auto-generated constructor stub
	}
	// 2. 메소드
	// getter 메소드
	// -> 클래스 내부에 있는 필드 값을
	// 외부(다른 클래스)에서 가져갈 수 있는 메소드
	public String getName() {
		return name;
	}
	
	//setter 메소드
	// -> 클래스 내부에 있는 필드 값을
	// 외부(다른 클래스)에서 수정할 수 있도록 하는 메소드
	public void setName(String name) {
		this.name = name; //갈색name : 입력값 파랑: 입력값을 받음
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	


}
