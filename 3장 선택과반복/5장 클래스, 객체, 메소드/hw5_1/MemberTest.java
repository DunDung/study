/*
 * ���ϸ�: MemberTest.java
 * �ۼ���: 2018.4.5
 * �ۼ���: ȫ�ؼ�
 * ����: �ΰ��� Ŭ������ ������ ȸ�� ���α׷�
 */
package hw5_1;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw5_1: ȫ�ؼ�");
		Member [] m = new Member[5]; //(1) ȸ�� 5���� ���� - ȸ�� �迭�� ����� ��
		for(int i =0; i<5; i++) {
			m[i] = new Member();
			m[i].setGrade(i+1); //(2) ȸ�� 5���� ����� 1, 2, 3, 4, 5�� ���� - ȸ��������� �޼ҵ� 5�� ȣ��
			m[i].addPoing(); //(3) ȸ�� 5���� ����Ʈ ���� - ����Ʈ���� �޼ҵ� 5�� ȣ��
			m[i].addPoing();//(3) ȸ�� 5���� ����Ʈ ���� - ����Ʈ���� �޼ҵ� 5�� ȣ��
			//(5) ȸ�� 5���� ���η��� ��ȸ�Ͽ� ��� - ���η���ȸ�޼ҵ� 5�� ȣ��
			System.out.println(i+1 + "��° ȸ���� ������ = "+m[i].getDiscountRate()); 
		}
	}
}
