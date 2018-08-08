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
			System.out.println("���� " + id + ": �ܾ� �������� ��� ����");
		else
			super.withdraw(amount);
	}
}