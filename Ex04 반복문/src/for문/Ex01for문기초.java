package for문;

public class Ex01for문기초 {

	public static void main(String[] args) {
		// for문
		// while문과 달리, 반복 횟수가 정해진 반복문

		// 기본 구조
		// for (초기화구문; 조건식; 반복후작업) { 로직 }
		// -초기화구문 : 반복문이 처음 시작될 때 딱 한번만 실행
		// -조건식 : 반복 조건
		// - 반복 후 작업 : 로직 반복 후 작업해야하는 파트

		// i가 0부터 5가 되기 전까지
		/*
		 * for(int i=0; i< 5; i++) { System.out.println(i); }
		 */

		 //연습1. 96부터 73까지 출력 (반복 후 작업 포인트)
		for (int i=96; i>=73; i--) {
			System.out.print(i + " ");
		}
		//연습2. 96부터 73까지 인데 홀수만 출력 (출력조건 포인트)
		//=> 각각 for문 만들어서 풀기
		for(int i=96; i>=73; i--) {
			if(i%2 ==1) {
				System.out.print(i+" ");
			}
		}
	}
}
