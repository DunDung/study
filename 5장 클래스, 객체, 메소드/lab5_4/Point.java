
/*
 * ���ϸ�: Point.java
 * �ۼ���: 2018.4.5
 * �ۼ���: ȫ�ؼ�
 * ����:  x ��ǥ�� ���� 1���� ���� ǥ���ϴ� Point Ŭ������ ����
 */
package lab5_4;

public class Point {
	// (1) �ʵ�: double�� x ��ǥ
	double x;
	// (2) move() �޼ҵ� : double�� �Ű������� �� ����ŭ x ��ǥ�� �̵�
	public void move(double n) {
		x+=n;
	}
	
	public void move() {
		x++;
	}
	public double distance(Point p) {
		return Math.abs(x - p.x);
	}

	// toString() �޼ҵ�: Point�� �Ӽ��� ���ڿ��� ����� ���� - @Override, public�� 6, 7�忡�� ���
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}
}
