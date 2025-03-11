package 메소드기초;

public class Ex06메소드실습_완전수 {

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		System.out.print(startValue + "~" + endValue + "까지의 완전수 :");
		getPerfectNumber(startValue, endValue);
		//start ~ end 돌면서 완전수를 발견하면 출력하는 메소드
	}

	public static void getPerfectNumber(int start, int end) {
		//start ~ end 돌면서 완전수인지 판단
		// s가 완전수라는 근거 : 1~s까지의 수를 다 s에 나눠보고, 나눠 떨어지는 합이 s와 같아야한다
		for(int i=start; i<=end; i++) {
			int sum =0;
			for(int j=1; j<i; j++) { //j는 1부터 i미만 수까지 반복하면서 i에 나눴을때 나눠 떨어지는지 검사 -> 나눠 떨어졌다면 합산
				if(i % j == 0 ) {
					sum += j;
				}
			}
			if(sum == i) { //완전수라면 출력
				System.out.print(i + " ");
				}
			}
		
		}

	}

