package lab6_4;

public class BankAccount {
	private int bankAccountNumber; //계좌번호
	private int balance; //잔액
	private static int bankAccountCount = 0; //계좌 수
	public static final int MIN_WITHDRAW = 100; //출금 최소단위
	
	public BankAccount() { //생성자
		balance = 0;
		++bankAccountCount;
		bankAccountNumber = bankAccountCount; 
	}
	
	public static int getBankAccountCount() { //계좌수 조회
		return bankAccountCount;
	}

	public String toString() { //계좌번호, 잔액을 문자열로 리턴
		return "계좌번호 = "+ bankAccountNumber + " 잔액 = "+balance;
	}
}
