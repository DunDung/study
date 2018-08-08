/*
 * ���ϸ�: CircleTest.java
 * �ۼ���: 2018.4.12
 * �ۼ���: ȫ�ؼ�
 * ����: �� ���α׷� �ۼ�
 */
package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab6_2: ȫ�ؼ�");

		Circle c1 = new Circle(); // (1) �� ����(c1)
		Circle c2 = new Circle(2.5); //(2) �������� 2.5�� �� ����(c2)
		System.out.println("c1�� ������: "+c1.getRadius());//(3) c1, c2�� �������� ��ȸ�Ͽ� ���
		System.out.println("c2�� ������: "+c2.getRadius());
		
		System.out.println("c1�� ����: "+c1.area()); //(4) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("c2�� ����: "+c2.area());
		
		c1.setRadius(c2.getRadius()); // (5) c1�� �������� c2�� ������ ������ ����
		
		System.out.println("c1�� ������: "+c1.getRadius());// (6) c1, c2�� �������� ��ȸ�Ͽ� ���
		System.out.println("c2�� ������: "+c2.getRadius());
		
		System.out.println("c1�� ����: "+c1.area()); //(7) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("c2�� ����: "+c2.area());
		
		c2.setRadius(1.5); //(8) c2�� �������� 1.5�� ����
		
		System.out.println("c1�� ����: "+c1.area()); //(9) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("c2�� ����: "+c2.area());
		
	}

}
