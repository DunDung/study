package hw7_1;

public class MinusAccount extends BankAccount {
	private int creditLine;

	public MinusAccount(int id, int balance, int creditLine) {
		super(id, balance);
		this.creditLine = creditLine;
	}

	public MinusAccount(int id, int creditLine) {
		super(id);
		this.creditLine = creditLine;
	}

	public int getCreditLine() {
		return creditLine;
	}
	@Override
	public void withdraw(int amount) {
		if(getBalance()+creditLine<amount)
			System.out.println("계좌 " + id + ": 잔액 부족으로 출금 실패");
		else
			super.withdraw(amount);
	}
}