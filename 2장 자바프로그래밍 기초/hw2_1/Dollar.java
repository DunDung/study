/*
 * ���ϸ�: Dollar.java
 * �ۼ���: 2018.3.15
 * �ۼ���: ȫ�ؼ�
 * ����: �����뿡 �ִ� �޷��� ��ȭ�� ȯ���ϴ� ���α׷�  
 */
package hw2_1;

import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {
		System.out.println("hw2_1: ȫ�ؼ�\n");
		//��ĳ�� ��ä ����
		Scanner input = new Scanner(System.in);
		//�����뿡�ִ� �������� ������ �Է� �ޱ�
		System.out.print("500�� ���� �Է�: ");
		int fiveHundred = input.nextInt();
		System.out.print("100�� ���� �Է�: ");
		int oneHundred = input.nextInt();
		System.out.print("50�� ���� �Է�: ");
		int fifty = input.nextInt();
		System.out.print("10�� ���� �Է�: ");
		int ten = input.nextInt();

		//���� �Ѿ� ���
		int money = fiveHundred*500 + oneHundred*100 + fifty*50 + ten*10;
		int exchangeRate = 1060;

		System.out.println("\n���� �Ѿ� = "+ money);
		System.out.println("�޷� �׼� = "+ money/exchangeRate);
		System.out.println("���� ��ȭ = "+ money%exchangeRate);
	}
}
