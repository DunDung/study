package hw6_2;

public class BankAccount {
	private int accountNumber; //계좌번호
	private String accountName; //예금주
	private int balance;//잔액
	
	//계좌번호, 예금주명, 잔액을 매개변수로 받아 초기화하는 constructor 
	public BankAccount(int accountNumber, String accountName, int balance) {
		this.accountNumber =accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		if(this.balance<0)
			this.balance = 0;
	}
	//계좌번호, 예금주명을 매개변수로 받아 초기화하는 constructor 
	public BankAccount(int accountNumber, String accountName) { //계좌번호 getter 
		this(accountNumber, accountName, 0);
	}
	public int getAccountNumber() { //계좌번호 getter 
		return accountNumber;
	}
	public String getAccountName() { //예금주명 getter
		return accountName;
	}
	public void setAccountName(String accountName) { //예금주명 setter
		this.accountName = accountName;
	}
	public int getBalance() { //잔액 getter
		return balance;
	}
	public void deposit(int balance) { //입금
		if(balance >= 0)
			this.balance += balance;
		else
			System.out.println("양수를 입력하세요.");
	}
	public void withdraw(int balance) { // 출금 - 잔액 부족시 출금은 이루어지지 않고 오류 메시지 출력
		if(0 > this.balance - balance)
			System.out.println("잔액부족");
		else if(balance < 0) System.out.println("양수를 입력하세요.");
		else
			this.balance -= balance;
	}
	@Override 
	public String toString() { //toString() - 계좌번호, 예금주명, 잔액을 문자열로 리턴 
		return "계좌번호 = "+getAccountNumber()+", 예금주명 = " +getAccountName()+", 잔액 = "+balance;
	}
	//송금 - 다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금 내 계좌의 잔액 부족시 송금은 이루어지지 않고 오류 메시지 출력
	public void transfer(BankAccount a, int balance) {
		if(0 > this.balance - balance)
			System.out.println("잔액부족");
		else if(balance < 0) System.out.println("양수를 입력하세요.");
		else {
			withdraw(balance);
			a.deposit(balance);
		}
	}
}
