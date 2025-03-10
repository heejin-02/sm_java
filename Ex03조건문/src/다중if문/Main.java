package 다중if문;

import java.util.Scanner;
//백준 연습 문제
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        //알람시계
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(H == 0) {
        	System.out.println("23 "+((60-M)+15));
        }
        else if (H>0 && M >0) {
        	System.out.println((H-1) + " " +((M+60) - 45));
        }
        
        
        
        //사분면
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        
//        if (x > 0 && y > 0) {
//        	System.out.print("1");
//        }
//        else if (x <0 && y >0) {
//        	System.out.print("2");
//        }
//        else if (x >0 && y <0) {
//        	System.out.println("4");
//        }
//        else {
//        	System.out.println("3");
//        }
//        
//        
        //윤년
//        int year = sc.nextInt();
//        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
//        	System.out.println("1");
//        }
//        else {
//        	System.out.println("0");
//        }
                
        //크기 비교하기
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        
//        if(num1 > num2) {
//            System.out.print(">");
//        }
//        else if(num1<num2) {
//            System.out.print("<");
//        }
//        else
//            System.out.println("==");
//	}
	}
}
