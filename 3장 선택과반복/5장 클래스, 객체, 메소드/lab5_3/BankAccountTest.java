/*
 * 파일명: BankAccount.java
 * 작성일: 2018.4. 3
 * 작성자: 홍준성
 * 내용: 은행 계좌 프로그램 작성  
 */
package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab5_3: 홍준성\n");
		BankAccount b = new BankAccount(); //객체 하나 생성
		b.deposit(2000); //+2000
		b.deposit(3000); //+3000
		System.out.println("계좌잔액: "+b.balance); //잔액 필드 출력
		System.out.println("잔액조회: "+b.getBalance()); //getBalance로 잔액 조회
		b.withdraw(1000); //1000원 출금
		System.out.println("잔액조회: "+b.getBalance()); //getBalance로 잔액 조회
	}
}
