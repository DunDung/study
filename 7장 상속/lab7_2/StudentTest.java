/*
 * ���ϸ�: StudentTest.java
 * �ۼ���: 2018.5.10
 * �ۼ���: ȫ�ؼ�
 * ����: ������ ���� �л� ������ ���� �л��� abstract class�� �����ϰ�, �̸� ����ϴ� �кλ�, ���п��� Ŭ������ �����ϰ� ����غ���.
 */
package lab7_2;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab7_2: ȫ�ؼ�");
		//(1) �й� 11, ���� 1.5�� �ʱ�ȭ�� �кλ��� ����
		UnderGraduateStudent u = new UnderGraduateStudent(11, 1.5);
		//(2) �й� 222, ���� 1.5�� �ʱ�ȭ�� ���п����� ����
		GraduateStudent g = new GraduateStudent(222, 1.5);
		//(3) �кλ��� �й�, ����, �л��� ���θ� ��ȸ�Ͽ� ���
		System.out.println(u.getId()+" "+u.getScore()+" "+u.warning()); 
		//(4) ���п����� �й�, ����, �л��� ���θ� ��ȸ�Ͽ� ���
		System.out.println(g.getId()+" "+g.getScore()+" "+g.warning()); 
	}
}
