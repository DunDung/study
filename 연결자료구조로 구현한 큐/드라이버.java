/*
 * ���ϸ�: ����̹�.java
 * �ۼ���: ȫ�ؼ�
 * �ۼ���: 2017�� 11�� 7��
 * ����: int�� �ڷḦ �����ϴ� ť�� �����ڷᱸ���� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
package hw8_2;

import java.util.Scanner;

public class ����̹� {

	public static void main(String[] args) {
		System.out.println("hw8_2: ȫ�ؼ�\n");
		MyLinkedQueue q = new MyLinkedQueue();
		Scanner input = new Scanner(System.in);

		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;
		int index = 0;

		// ���Ḧ ������ ������ �ݺ��Ͽ� �޴��� �����ϰ� �׿� �´� �۾��� ����
		do {
			System.out.print("1:���� 2:���� 3:��ü���� 4:���� --->");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("���� �Է� : ");
				item = input.nextInt();
				q.enQueue(item);
				break;
			case 2:
				System.out.println(q.deQueue());
				break;
			case 3:
				while(!q.isEmpty()) //ť�� ����ִ� �����϶����� deQueue�� �Ѵ�.
					System.out.println(q.deQueue());
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�޴� ��ȣ ����: �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 4);

	}
}

