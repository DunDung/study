
/*
 * ���ϸ�: InputTest.java
 * �ۼ���: 2018.3.15
 * �ۼ���: ȫ�ؼ�
 * ����:  Scanner Ŭ������ �̿��� �Է��� �����ϴ� ���α׷�
 */

package lab2_1;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		System.out.println("lab2_1: ȫ�ؼ�\n");

		Scanner input = new Scanner(System.in);
		System.out.print("���ø� �Է�: ");
		String city = input.nextLine();
		System.out.print("�α� �Է�(������ ����): ");
		int population = input.nextInt();
		System.out.print("��� ��� �Է�: ");
		double averageDegree = input.nextDouble();

		System.out.println("");
		System.out.println("���ø� = "+ city);
		System.out.println("�α� = "+population+"��");
		System.out.println("��� ��� = "+averageDegree);
	}
}
