package 추상클래스;

public class Main {

	public static void main(String[] args) {
		RegularEmployee r = new RegularEmployee("0001", "홍길동", 4000, 100);
		System.out.println(r.print());
		System.out.println(r.getMoneyPay());
		
		TempEmployee t = new TempEmployee("0002", "주미리", 4000);
		System.out.println(t.print());
		
		PartTimeEmployee p = new PartTimeEmployee("0003", "신재영", 50, 20);
		System.out.println(p.print());
	}

}

