//���ϸ� : Method.java
//�ۼ��� : 201432041 ȫ�ؼ�
//�ۼ��� : 2017�� 9�� 5��
//���� : �޼ҵ带 ȣ���Ͽ� ����ڰ� �Է��� ������ �߿��� �ִ밪�� �˾Ƴ��� ���α׷�

package lab0_4;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		System.out.println("lab0_4 : ȫ�ؼ�");
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ���: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.print("�ִ밪 = " +findMax(a, b));
	}
	public static int findMax(int a, int b) {
		if(a > b)
			return a;
		return b;	
	}
}
