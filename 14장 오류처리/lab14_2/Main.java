/*
 * ���ϸ�: Main.java
 * �ۼ���: 2018.5.31
 * �ۼ���: ȫ�ؼ�
 */
package lab14_2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: ȫ�ؼ�");
		Scanner scan = new Scanner(System.in);

		int x, y, result;
		try {
			System.out.print("���� x �Է�: ");
			x = scan.nextInt();
			System.out.print("���� y �Է�: ");
			y = scan.nextInt();
			result = x / y;
		}catch(ArithmeticException e1) { //0�� �Է����� ��
			result = 0;
		}catch(InputMismatchException e2) { //���ڸ� �Է����� ��
			result = 1;
		}
		
		System.out.println("result = " + result);
	}
}
