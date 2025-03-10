package 배열코테;

import java.util.Scanner;

public class Ex01_3의배수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int num = 0;
		int count =0;
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번 째 정수 입력 >>");
			num = sc.nextInt();
			if (num % 3 == 0) {
				array[count] = num;
				count++;
			}
		}
		System.out.print("3의 배수 : ");
		for(int i=0; i<count; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
