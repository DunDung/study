/*
 * ���ϸ�: BankAccount.java
 * �ۼ���: 2018.4. 3
 * �ۼ���: ȫ�ؼ�
 * ����: ���� ���� ���α׷� �ۼ�  
 */
package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab5_3: ȫ�ؼ�\n");
		BankAccount b = new BankAccount(); //��ü �ϳ� ����
		b.deposit(2000); //+2000
		b.deposit(3000); //+3000
		System.out.println("�����ܾ�: "+b.balance); //�ܾ� �ʵ� ���
		System.out.println("�ܾ���ȸ: "+b.getBalance()); //getBalance�� �ܾ� ��ȸ
		b.withdraw(1000); //1000�� ���
		System.out.println("�ܾ���ȸ: "+b.getBalance()); //getBalance�� �ܾ� ��ȸ
	}
}
