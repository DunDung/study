//���ϸ� : Method2.java
//�ۼ��� : 201432041 ȫ�ؼ�
//�ۼ��� : 2017�� 9��85��
//���� : ����ڰ� �Է��� ������ �߿��� �ִ밪�� �ε����� �˾Ƴ��� ���α׷���

package lab0_5;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		
		System.out.println("lab0_5 : ȫ�ؼ�");
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ���: ");
		n = input.nextInt();
		
		int[] array = new int[n];
		System.out.print(n+"���� ������ �Է��ϼ���:");
		
		for(int i = 0; i < n; i++) 
			array[i] = input.nextInt();
		
		System.out.println("�ִ밪 �ε��� = "+getMaxindex(array));
		System.out.println("�ִ밪 = " +array[getMaxindex(array)]);
		}

	public static int getMaxindex(int array[]) {
		int max = array[0];
		int index = 0;
		
		for(int i = 1; i < array.length; i++) {
			if(max<array[i]) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}
}
