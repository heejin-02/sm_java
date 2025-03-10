package 배열개념;

public class Ex02이중배열 {
	public static void main(String[] args) {
		//배열은 이차원으로 만들 수 있음
		
		// 일차원 배열
		// int[] 배열 이름 = new int[갯수];
		
		//이차원 배열
		//int[][] 배열 이름 = new int[행][열];
		
		int[][] array = new int[3][4];
		// 2. 배열에 값 할당
		// array[0][0] = 1;
		
		//1.이차원 배열 생성(4개의 데이터를 담을 수 있는 배열을 3개로 묶음)
		int[][] array2 = {
				{1,2,3,4}, //0행
				{5,6,7,8}, //1행
				{9,10,11,12} //2행
		};
	
		//7이라는 데이터에 접근
		System.out.println(array2[1][2]);
		System.out.println(array2[1]); //정확히 행 열을 지정해주어야한다.
		
		System.out.println(array2[0][3]);
		System.out.println(array2[1][3]);
		System.out.println(array2[2][3]);
		
	}
}
