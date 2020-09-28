/*
 * 파일명: BankAccountTest.java
 * 작성일: 2018.4.17
 * 작성자: 홍준성
 * 내용: 은행계좌3
 */
package hw6_2;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("hw6_2: 홍준성");
		Scanner input = new Scanner(System.in);
		 // (1) 계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 생성(account1 이라고 하자)
		BankAccount account1 = new BankAccount(1, "kim", 9000); //
		//(2) 계좌번호 2, 예금주명 lee로 초기화한 은행계좌 생성(account2 라고 하자)
		BankAccount account2 = new BankAccount(2, "lee");

		for(int i = 0; i<2; i++) {
			System.out.print("입급액 입력: ");//3) 사용자로부터 입금액을 입력받아 account2에 입금
			int balance = input.nextInt();
			account2.deposit(balance);
			System.out.print("출금액 입력: "); //(4) 사용자로부터 출금액을 입력받아 account2에서 출금
			balance = input.nextInt();
			account2.withdraw(balance);
		}
		for(int i = 0; i<2; i++) { //(7) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
			System.out.print("송금액 입력: ");
			int balance = input.nextInt();
			account2.transfer(account1, balance);
		}
		account2.setAccountName("park"); //   (9) account2의 예금주명을 park으로 수정
		System.out.println(account2); // (10) account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println(account1); // (11) account1의 계좌번호, 예금주명, 잔액 출력
	}
}
