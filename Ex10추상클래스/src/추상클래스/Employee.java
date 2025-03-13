package 추상클래스;

public abstract class Employee {
	// 접근제한자
	// public >> protected >> package(default) >> private
	// public : 모든 클래스에서 접근 가능
	// protected : 같은 패키지 + 상속 관계끼리 접근 가능
	// package : 같은 패키지끼리 접근 가능
	// private : 외부 클래스에서 접근 불가
	
	protected String empno;
	protected String name;
	protected int pay;
	
	public abstract int getMoneyPay();
	
	public String print() {
		 return empno + "/" + name + "/"+ pay;
	}

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
}
