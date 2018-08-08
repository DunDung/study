/*
 * ���ϸ�: Main.java
 * �ۼ���: 2018.5.4
 * �ۼ���: ȫ�ؼ�
 * ����: ���� ���� ���α׷�
 */
package mid2_2;

public class Main {

	public static void main(String[] args) {
		System.out.println("mid2_2: ȫ�ؼ�");
		// (1)���̵� 11�� ���� acc1 ����
		Account acc1 = new Account(11);
		// (2)���̵� 22, �ܾ� 2000, �ݸ� 0.06�� ���� acc2 ����   
		Account acc2 = new Account(22, 2000, 0.06);
		// acc1�� acc2�� ���ϴ� �޼ҵ� ȣ��
		compare(acc1, acc2);
		compare(acc2, acc1); 
	}

	// (3) �Ű������� ���� ������� a1, a2�߿��� ���ڰ� ����
	//     ������ ���̵� ����ϴ� �޼ҵ�
	// -���ڰ� �����ϸ� �����ϴٰ� ����� ��
	private static void compare(Account a1, Account a2){ 
		if(a1.getInterest()>a2.getInterest())
			System.out.println(a1.getId());
		else if(a1.getInterest()<a2.getInterest())
			System.out.println(a2.getId());
		else
			System.out.println("�����ϴ�");
	}
}
