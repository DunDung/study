/*
 * 파일명: BankAccountTest.java
 * 작성일: 2018.4.24
 * 작성자: 홍준성
 * 내용: 은행계좌 프로그램
 */
package lab6_4;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab6_4: 홍준성");
		System.out.println("계좌 수 = "+BankAccount.getBankAccountCount()); //계좌수 출력
		System.out.println("출금 최소단위 = "+BankAccount.MIN_WITHDRAW); // 출금 최소단위 출력
		BankAccount account1 = new BankAccount();//객체 생성
		BankAccount account2 = new BankAccount();
		System.out.println("계좌 수 = "+BankAccount.getBankAccountCount()); //계좌수 조회 후 출력
		System.out.println(account1);
		System.out.println(account2);
	}
}
