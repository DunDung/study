/*
 * ���ϸ�: arraySum.java
 * �ۼ���: 2018.3.27
 * �ۼ���: ȫ�ؼ�
 * ����: �迭 ������ ���� ���ϴ� ���α׷�  
 */
package lab4_2;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("lab4_2: ȫ�ؼ�\n");
		Scanner input = new Scanner(System.in);

		System.out.print("���� ���� �Է�: ");
		int n = input.nextInt();
		int [] array = new int[n];
		System.out.print("���� "+n+"�� �Է�: ");

		for(int i = 0; i<array.length; i++)
			array[i] = input.nextInt();

		System.out.println("�� = "+getSum(array));

	}
	static int getSum(int [] a) { //for each�� �̿��ؼ� sum�� ���� ���� �� ����
		int sum = 0;
		for(int i : a) 
			sum += i;
		return sum;
	}

}
