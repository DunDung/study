/*
 * ���ϸ�: AccountTest.java
 * �ۼ���: 2018.5.9
 * �ۼ���: ȫ�ؼ�
 * ����: ������� Ŭ������ ����ϴ� �Ϲݰ���, ���̳ʽ�������� Ŭ������ �����ϰ� ����ϴ� ���α׷� 
 */
package hw7_1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("hw7_1: ȫ�ؼ�");
		Scanner scan = new Scanner(System.in);
		NormalAccount acc1 = new NormalAccount(11, 1000); //�Ϲ� ����(���¹�ȣ 11, �ܾ� 1000�� �ʱ�ȭ)
		NormalAccount acc2 = new NormalAccount(22); //�Ϲ� ����(���¹�ȣ 22�� �ʱ�ȭ)
		MinusAccount acc3 = new MinusAccount(33, 1000, 500); //���¹�ȣ 33, �ܾ� 1000, �����ѵ� 500�� �ʱ�ȭ)
		MinusAccount acc4 = new MinusAccount(44,500);	// (���¹�ȣ 44, �����ѵ� 500�� �ʱ�ȭ)

		//(2) 4�� ������ �ִ� ��� ���ɾ� ���� ���
		System.out.println("\n�ִ� ��� ���ɾ�");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getCreditLine()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getCreditLine()));
		//(3) ����ڷκ��� ��ݾ� �Է¹޾� 4�� ���¿��� ���� ��� ����
		System.out.print("\n��ݾ� �Է�: ");
		int amount = scan.nextInt();
		acc1.withdraw(amount);
		acc2.withdraw(amount);
		acc3.withdraw(amount);
		acc4.withdraw(amount);
		//(4) ����ڷκ��� �Աݾ� �Է¹޾� 4�� ���¿� ���� �Ա� ����
		System.out.print("\n�Աݾ� �Է�: ");
		amount = scan.nextInt();
		acc1.deposit(amount);
		acc2.deposit(amount);
		acc3.deposit(amount);
		acc4.deposit(amount);
		//(5) 4�� ������ �ִ� ��� ���ɾ� ���� ���
		System.out.println("\n�ִ� ��� ���ɾ�");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc2 = " + acc2.getBalance());
		System.out.println("acc3 = " + (acc3.getBalance()+acc3.getCreditLine()));
		System.out.println("acc4 = " + (acc4.getBalance()+acc4.getCreditLine()));
	}
}
