
//���ϸ� : Average.java
//�ۼ��� : 201432041 ȫ�ؼ�
//�ۼ��� : 2017�� 9�� 4��
//���� : ����ڰ� �Է��� 10���� ������ �� ��հ��� ��հ� �̻��� ���� ����ϴ� ���α׷�

package lab0_2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("lab0_2 : ȫ�ؼ�");
		Scanner input = new Scanner(System.in);
		int[] ave = new int[10];
		System.out.println("10���� ������ �Է��ϼ���.");
		
		for (int i = 0; i < 10; i++) 
			ave[i] = input.nextInt();		
		
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += ave[i];
		}
		
		sum = sum / 10;
		System.out.println("��� = " + sum);
		System.out.print("��� �̻��� �� =");
		
		for(int i = 0; i < 10; i++) {
			if (ave[i] >= sum)
			   System.out.print(ave[i] + " ");
		}
	}
}
