package mid2_2;

public class Account {
	private int id;  // 아이디
	private int balance; // 잔액
	private double interestRate; // 금리

	// 아이디를 매개변수로 받아 초기화 하는 생성자
	public Account(int id) {
		this(id, 3000, 0.03);
	}

	// 아이디, 잔액, 금리를 매개변수로 받아 초기화 하는 생성자
	public Account(int id, int balance, double interestRate) {
		this.id = id;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	// 아이디를 리턴하는 메소드
	public int getId() {
		return id;
	}

	// 이자(잔액 x 금리)를 계산하여 리턴하는 메소드
	public int getInterest() {
		return (int)(balance * interestRate);
	}
}


