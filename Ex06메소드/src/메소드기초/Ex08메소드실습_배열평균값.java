package 메소드기초;

public class Ex08메소드실습_배열평균값 {

	public static void main(String[] args) {
		int[] array = {15,10,2,8,23};
		System.out.println("평균값은 " + avg_arr(array));
	}
	public static float avg_arr(int [] a) {
		float sum = 0;
		float avg = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		 avg = sum/a.length;
		 return avg;
	}
	

}
