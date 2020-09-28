package hw7_1;

public class NormalAccount extends BankAccount{

	public NormalAccount(int id, int balance) {
		super(id, balance);
	}

	public NormalAccount(int id) {
		super(id);
	}
	@Override
	public void withdraw(int amount) {
		if(getBalance()<amount)
			System.out.println("���� " + id + ": �ܾ� �������� ��� ����");
		else
			super.withdraw(amount);
	}
}