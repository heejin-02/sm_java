package 배열코테;

import java.util.Random;

public class Ex03_로또번호 {

	public static void main(String[] args) {
		int [] array = new int[5];
		Random ran = new Random();
		for(int i =0; i<array.length; i++) {
			int num = ran.nextInt(9)+1;
			for(int j = 0; j<array.length; j++) {
				if(num == array[j]) {
					i =0;
				}
			}
			array[i] = num;
		}
		System.out.print("이번주 추첨 번호는 ~~ ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " "); 
		}

	}

}
