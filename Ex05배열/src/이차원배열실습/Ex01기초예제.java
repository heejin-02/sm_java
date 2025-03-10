package 이차원배열실습;

public class Ex01기초예제 {

	public static void main(String[] args) {
		int[][] array2 = { 
				{ 1, 2, 3, 4 }, // 0행
				{ 5, 6, 7, 8 }, // 1행
				{ 9, 10, 11, 12 } // 2행
		};

		// for문 써서 1,2,3,4 출력
		// array2.length : array2행의 갯수 -> 2
		// array2[0].length : array2의 0번 행이 가지고 있는 데이터의 갯수 -> 4
		for (int i = 0; i<array2[0].length; i++) {
			System.out.print(array2[0][i] + " ");
		}
		System.out.println();
		//for문 써서 5,6,7,8 출력
		for (int i =0; i<array2[1].length; i++) {
			System.out.print(array2[1][i] + " ");
		}
		System.out.println();
		//for문 써서 9.10,11,12 출력
		for (int i=0; i<array2[2].length; i++) {
			System.out.print(array2[2][i] + " ");
		}
		//for문이 총 3개
		System.out.println();
		
		
		for (int j=0; j<array2.length; j++) {
			for(int i=0; i<array2[j].length; i++) {
				System.out.print(array2[j][i] + " ");
			}
			System.out.println();
		}
		
		
	}

}
