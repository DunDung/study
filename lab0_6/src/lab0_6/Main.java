//���ϸ� : Method2.java
//�ۼ��� : 201432041 ȫ�ؼ�
//�ۼ��� : 2017�� 9�� 8��
//���� : MyPair Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷���
package lab0_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lab0_6 : ȫ�ؼ�");
		int a = 0;
		int b = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("2���� ������ �Է��ϼ��� :");
		a = input.nextInt();
		b = input.nextInt();
		
		MyPair pair = new MyPair(a, b);
		
		System.out.println(pair.toString());
		System.out.println("�� = "+pair.sum());
		System.out.println("��� = "+pair.average());
		
		pair.swap();
		
		System.out.println(pair.toString());
		System.out.println("�� = "+pair.sum());
		System.out.println("��� = "+pair.average());
	}

}
