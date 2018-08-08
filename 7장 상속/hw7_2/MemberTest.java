/*
 * ���ϸ�: MemberTest.java
 * �ۼ���: 2018.5.17
 * �ۼ���: ȫ�ؼ�
 * ����: ȸ���� abstract class�� �����ϰ�, �̸� ����ϴ� �ð���ȸ��, ��ȸ�� Ŭ������ �����ϰ� �̿��ϴ� ���α׷��� 
*/
package hw7_2;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw7_2: ȫ�ؼ�");
		
		double averageAge = 0;
		int paymentSum = 0;
		Member [] m = new Member[4]; //(1) ũ�Ⱑ 4�� Member �迭�� ����
		
		m[0] = new HourlyMember(22, 2);
		m[1] = new HourlyMember(33, 3);
		m[2] = new RegularMember(44);
		m[3] = new RegularMember(55);
	
		for(int i = 0; i<4; i++) {  //���� ��հ� ȸ���� ���� ���ϱ� ���� �ݺ���
			averageAge += m[i].getAge();
			paymentSum += m[i].getPayment();
		}
		System.out.println("���� ��� = "+averageAge/m.length); //(3) ȸ���� ���� ����� ���� ���
		System.out.println("ȸ�� �� = "+paymentSum); //(4) ȸ���� ȸ�� ���� ���� ���
	}
		
		
}
