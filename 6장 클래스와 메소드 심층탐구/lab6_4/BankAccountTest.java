/*
 * ���ϸ�: BankAccountTest.java
 * �ۼ���: 2018.4.24
 * �ۼ���: ȫ�ؼ�
 * ����: ������� ���α׷�
 */
package lab6_4;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab6_4: ȫ�ؼ�");
		System.out.println("���� �� = "+BankAccount.getBankAccountCount()); //���¼� ���
		System.out.println("��� �ּҴ��� = "+BankAccount.MIN_WITHDRAW); // ��� �ּҴ��� ���
		BankAccount account1 = new BankAccount();//��ü ����
		BankAccount account2 = new BankAccount();
		System.out.println("���� �� = "+BankAccount.getBankAccountCount()); //���¼� ��ȸ �� ���
		System.out.println(account1);
		System.out.println(account2);
	}
}
