package 클래스객체기초;

public class BankMain {

	public static void main(String[] args) {
		Bank mrBank = new Bank(); //객체 생성
		
		// mrBank.money = 1000; money가 private가 되어서 접근이 불가능 -> 오류
		mrBank.inMoney(1000); //입금
		mrBank.outMoney(300); //출금

		// System.out.println(mrBank.money); -> 오류
		
		System.out.println("잔액은 " + mrBank.ShowMoney());
	}

}
