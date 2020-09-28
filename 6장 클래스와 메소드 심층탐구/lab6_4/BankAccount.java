package lab6_4;

public class BankAccount {
	private int bankAccountNumber; //���¹�ȣ
	private int balance; //�ܾ�
	private static int bankAccountCount = 0; //���� ��
	public static final int MIN_WITHDRAW = 100; //��� �ּҴ���
	
	public BankAccount() { //������
		balance = 0;
		++bankAccountCount;
		bankAccountNumber = bankAccountCount; 
	}
	
	public static int getBankAccountCount() { //���¼� ��ȸ
		return bankAccountCount;
	}

	public String toString() { //���¹�ȣ, �ܾ��� ���ڿ��� ����
		return "���¹�ȣ = "+ bankAccountNumber + " �ܾ� = "+balance;
	}
}
