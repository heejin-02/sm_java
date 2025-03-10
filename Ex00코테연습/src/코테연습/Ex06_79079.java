package 코테연습;

import java.util.Scanner;

public class Ex06_79079 {

	public static void main(String[] args) {
		int a = 77;
		int b = 0;
		
		for(int i=0;i<a;i++ )
		{
			b += (a-i)*(i+1);
		}
		System.out.println(b);
		
		
	}

}
