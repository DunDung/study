package lab5_3;

public class BankAccount {
	int balance = 0;;

	public void deposit(int amount) { //�Ա�
		balance += amount;
	}
	public int getBalance() { //�ܾ���ȸ
		return balance;
	}
	
	public void withdraw(int amount) { //���
		balance -= amount;
	}
	
}
