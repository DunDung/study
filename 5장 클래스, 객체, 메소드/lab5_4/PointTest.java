/*
 * ���ϸ�: PointTest.java
 * �ۼ���: 2018.4.5
 * �ۼ���: ȫ�ؼ�
 * ����:  ���� ǥ���ϴ� Point Ŭ���� ��ü�� �����ϰ� �̿��ϴ� ���α׷�
 */
package lab5_4;

public class PointTest {
	public static void main(String[] args) {
		System.out.println("lab5_4: ȫ�ؼ�");

		// (5) Point ��ü p1, p2�� ����
		Point p1 = new Point();
		Point p2 = new Point();

		// (6) p1�� 5.5  ��ŭ �̵�, p2�� -1.0��ŭ �̵�
		p1.move(5.5);
		p2.move(-1.0);
		p1.move();
		

		// p1, p2�� �Ӽ��� ���
		System.out.println(p1.toString()); // p1.toString() ��� p1 ��� ��� ��
		System.out.println(p2.toString()); // p2.toString() ��� p2 ��� ��� ��
		System.out.println("�Ÿ� = "+p2.distance(p1));
	}
}
