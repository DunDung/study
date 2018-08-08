package lab5_3;

public class BankAccount {
	int balance = 0;;

	public void deposit(int amount) { //입금
		balance += amount;
	}
	public int getBalance() { //잔액조회
		return balance;
	}
	
	public void withdraw(int amount) { //출금
		balance -= amount;
	}
	
}
