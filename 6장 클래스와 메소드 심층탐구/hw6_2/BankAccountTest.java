/*
 * ���ϸ�: BankAccountTest.java
 * �ۼ���: 2018.4.17
 * �ۼ���: ȫ�ؼ�
 * ����: �������3
 */
package hw6_2;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("hw6_2: ȫ�ؼ�");
		Scanner input = new Scanner(System.in);
		 // (1) ���¹�ȣ 1, �����ָ� kim, �ܾ� 9000���� �ʱ�ȭ�� ������� ����(account1 �̶�� ����)
		BankAccount account1 = new BankAccount(1, "kim", 9000); //
		//(2) ���¹�ȣ 2, �����ָ� lee�� �ʱ�ȭ�� ������� ����(account2 ��� ����)
		BankAccount account2 = new BankAccount(2, "lee");

		for(int i = 0; i<2; i++) {
			System.out.print("�Ա޾� �Է�: ");//3) ����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
			int balance = input.nextInt();
			account2.deposit(balance);
			System.out.print("��ݾ� �Է�: "); //(4) ����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
			balance = input.nextInt();
			account2.withdraw(balance);
		}
		for(int i = 0; i<2; i++) { //(7) ����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
			System.out.print("�۱ݾ� �Է�: ");
			int balance = input.nextInt();
			account2.transfer(account1, balance);
		}
		account2.setAccountName("park"); //   (9) account2�� �����ָ��� park���� ����
		System.out.println(account2); // (10) account2�� ���¹�ȣ, �����ָ�, �ܾ� ���
		System.out.println(account1); // (11) account1�� ���¹�ȣ, �����ָ�, �ܾ� ���
	}
}
