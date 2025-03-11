package 메소드기초;

public class Ex04메소드실습_약수 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		boolean divisior = isDivisor(num1,num2);
		
		System.out.println(divisior);

	}

	public static boolean isDivisor(int a, int b) {
		if(a % b == 0) {
			return true;
		}
		else 
			return false;
	}
}
