//���ϸ� : Max.java
//�ۼ��� : 201432041 ȫ�ؼ�
//�ۼ��� : 2017�� 9�� 5��
//���� : ����ڰ� �Է��� ������ �߿��� �ִ밪�� �˾Ƴ��� ���α׷�

package lab0_3;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		
		System.out.println("lab0_3 : ȫ�ؼ�");
		
		int num = 0;
		int max = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��ϼ���: ");
		num = input.nextInt();
		
		int[] array = new int[num];
		System.out.print(num + "���� ������ �Է��ϼ���: ");
		
		for (int i = 0; i < num; i++) 
			array[i] = input.nextInt();
		
		max = array[0];
		
		for(int i = 1; i < num; i++) {
			if(max < array[i])
				max = array[i];
		}
		System.out.print("�ִ밪 = " +max);
	}
}