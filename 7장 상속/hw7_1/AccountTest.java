/*
 * 파일명: AccountTest.java
 * 작성일: 2018.5.9
 * 작성자: 홍준성
 * 내용: 은행계좌 클래스를 상속하는 일반계좌, 마이너스통장계좌 클래스를 정의하고 사용하는 프로그램 
 */
package hw7_1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("hw7_1: 홍준성");
		Scanner scan = new Scanner(System.in);
		NormalAccount acc1 = new NormalAccount(11, 1000); //일반 계좌(계좌번호 11, 잔액 1000로 초기화)
		NormalAccount acc2 = new NormalAccount(22); //일반 계좌(계좌번호 22로 초기화)
		MinusAccount acc3 = new MinusAccount(33, 1000, 500); //계좌번호 33, 잔액 1000, 대출한도 500로 초기화)
		MinusAccount acc4 = new MinusAccount(44,500);	// (계좌번호 44, 대출한도 500로 초기화)

		//(2) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("\n최대 출금 가능액");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getCreditLine()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getCreditLine()));
		//(3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		System.out.print("\n출금액 입력: ");
		int amount = scan.nextInt();
		acc1.withdraw(amount);
		acc2.withdraw(amount);
		acc3.withdraw(amount);
		acc4.withdraw(amount);
		//(4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.print("\n입금액 입력: ");
		amount = scan.nextInt();
		acc1.deposit(amount);
		acc2.deposit(amount);
		acc3.deposit(amount);
		acc4.deposit(amount);
		//(5) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("\n최대 출금 가능액");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getCreditLine()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getCreditLine()));
	}
}
