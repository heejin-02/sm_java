package 배열코테;

import java.util.Arrays;

public class Ex02_위치출력 {

	public static void main(String[] args) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];
		int a = 0; // i순서
		int b = 0; // j순서
		int c = 0; // 최소 거리 저장
		int d = point[0]; // 최소 거리 비교
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (point[i] - point[j] > 0) {
					c = point[i] - point[j];
					if (d > c) {
						d = c;
						a = i;
						b = j;
					}
				}
			}
		}
		result[0] = a;
		result[1] = b;
		System.out.print("result = " + Arrays.toString(result));
	}

}
