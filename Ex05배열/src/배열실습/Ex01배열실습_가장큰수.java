package 배열실습;

import java.util.Arrays;

public class Ex01배열실습_가장큰수 {

	public static void main(String[] args) {
		// [실습] 가장 큰 수 찾기
		//1. 정수 데이터 5개를 저장할 수 있는 배열 array 만들기
		// --> 정수 데이터는 6,3,8,4,2
		// 2. 배열 안 데이터 중 가장 큰 값을 출력
		
		int[] array = {6,3,8,4,2};
		int max_num =0;		
		for (int i =0; i<array.length; i++) {
			if(array[i] > max_num) {
				max_num = array[i];
			}
		}
		System.out.println("array에 들어있는 값 : " + Arrays.toString(array));
		System.out.print("가장 큰 값은 "+max_num+" 입니다.");
		
		

	}

}
