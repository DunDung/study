/*
 * ���ϸ�: StringTest.java
 * �ۼ���: 2018.4.5
 * �ۼ���: ȫ�ؼ�
 * ����: �Ʒ� ÷���� �ڵ带 �̿��Ͽ� String Ŭ���� ���� ���α׷�
 */
package lab5_5;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {

		System.out.println("lab5_5: ȫ�ؼ�");

		// (1) ����ڷκ��� ���̰� 5 �̻��� �� ���� ���ڿ� s1, s2�� �Է¹���
		Scanner input = new Scanner(System.in);
		System.out.print("���̰� 5 �̻��� ���ڿ� s1 �Է�:");
		String s1 = input.nextLine();
		System.out.print("���̰� 5 �̻��� ���ڿ� s2 �Է�:");
		String s2 = input.nextLine();

		System.out.println(s1.length()); //�������
		System.out.println(s1.charAt(0)); //ù��°���� ���
		System.out.println(s1.substring(1, 4)); //�ι�°~�׹�° ���� ���
		System.out.println(s1.toUpperCase());//�빮�ڷ� ������ ��� ���
		System.out.println(s1.equals(s2)); //�������� ���� ���
		System.out.println(s1.equalsIgnoreCase(s2));//��ҹ��� �����ϰ� �������� ���� ���
		System.out.println(s1.compareTo(s2)); //���������� ���� ��� ���
	}
}