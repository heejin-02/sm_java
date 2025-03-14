package JDBC기초;

public class Ex01Join {
	public static void main(String[] args) {

		//JDBC(Java Database Connectivity)
		//: JDBC 인터페이스 사용 방법
		
		try {
			//try 구문
			// -> 예외가 발생할 수도 있지만, 우선 시도해보는 구간!
			
			// 1. 드라이버 로딩
			// JDBC 드라이버란?
			// java에서 제공해주는 인터페이스들을 데이터베이스 회사에서
			// 상속을 받아서 로직을 구현한 클래스 파일들의 모음
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// ---> 반드시, 프로젝트에 jar 파일을 넣어줘야한다.
			// jar파일이란?
			// --> 클래스 파일들을 여러개 모아놓은 압축파일
			// 프로젝트에 jar파일 추가하는 방법?
			// 프로젝트 선택 -> 마우스 우클릭 -> build path
			// -> configure build path -> libraries 탭 선택
			// -> class path 선택 -> 우측 add external jars 버튼 선택
			// -> 원하는 jar파일 경로 선택 -> apply and close
			
			
			// 2. 데이터베이스 연결
			// 준비물 3가지
			// 1) 연결 경로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//JDBC 드라이버가 thin 타입이다.
			//@localhost --> ip주소(127...)
			// 2) 계정 이름
			// 3) 계정 비밀번호
			
			
		} catch (ClassNotFoundException e) {
			// catch 구문
			// --> 예외가 발생했을 때, 어떤 로직을 수행할 지 작성하는 구간!
			// --> ()안에 있는 매개변수는, 어떤 예외상황을 잡아줄건지 기술하는 공간!
			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 나고 있는지
			// 출력해주는 구문!! --> 개발할 때만 사용하기
			// --> 배포할 떄는 삭제하는 것이 좋음!
			
		}
	}
}