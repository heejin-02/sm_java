package 메소드기초;

public class Ex05메소드실습_약수의합 {

	public static void main(String[] args) {
		int num = 30;
		int result = getSumOfDivisiors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);

	}
	public static int getSumOfDivisiors(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n% i == 0) {
				sum += i;
				System.out.print(i + " " + "\n");
			}
		}
		return sum;
	}

}
