/*
 * ���ϸ�: MyLinkedStackTest.java
 * �ۼ���: ȫ�ؼ�
 * �ۼ���: 2017�� 10�� 26��
 * ����: ���������� ���� �ڷᱸ���� ������ ���� ���� �߻��ڷ����� MyLinkedStack�� �����ϰ� �̸� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�
 */

import java.util.Scanner;

public class MyLinkedStackTest  {
	public static void main(String[] args) throws Exception {
		System.out.println("lab7_2: ȫ�ؼ�\n");

		MyLinkedStack s = new MyLinkedStack();
		Scanner scan = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;
		int index = 0;

		// ���Ḧ ������ ������ �ݺ��Ͽ� �޴��� �����ϰ� �׿� �´� �۾��� ����
		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:��ü���� 5:���� --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("���� �Է� : ");
				item = scan.nextInt();
				s.push(item);
				break;
			case 2:
				System.out.println(s.pop());
				break;
			case 3:
				System.out.println(s.peek());
				break;
			case 4:
				while(s.isEmpty() == false)
					System.out.println(s.pop());
				break;
			default:
				System.out.println("�޴� ��ȣ ����: �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 5);

	}

}

