/*
 * ���ϸ�: Main.java
 * �ۼ���: 2018.5.4
 * �ۼ���: ȫ�ؼ�
 * ����: ���� �ٷ�� ���α׷�
 */
package mid2_3;

public class Main {

	public static void main(String[] args) {  
		System.out.println("mid2_3: ȫ�ؼ�");
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5, new Point(10, 20));
		Circle c3 = new Circle(3.5, new Point(10, 20));

		System.out.println(c2.sameCenter(c1));    // false
		System.out.println(c2.sameCenter(c3));    // true

		printCircle(c2);
	}

	// (1) �Ű������� ���� �� c�� ������, �߽��� x, y��ǥ��
	//     ����ϴ� �޼ҵ�
	private static void printCircle(Circle c) {
		System.out.println(c.getRadius());
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
	}
}
