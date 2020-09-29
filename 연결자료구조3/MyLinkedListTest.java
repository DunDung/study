/*
 * ���ϸ�: MyLinkedListTest.java
 * �ۼ���: ȫ�ؼ�
 * �ۼ���: 2017�� 10�� 3��
 * ����: MyLinkedList ��ü�� �����ϰ� ����, ��� ����� �׽�Ʈ�ϴ� ���α׷�
 */
package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("hw6_1: ȫ�ؼ�\n");
		
		// ����ִ� ����Ʈ�� �����ϰ� ���
		MyLinkedList list = new MyLinkedList();
		Scanner scan = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;
		int index = 0;
		int x = 0;
		int y = 0;

		// ���Ḧ ������ ������ �ݺ��Ͽ� �޴��� �����ϰ� �׿� �´� �۾��� ����
		do {
			System.out.print("1:����Ʈ��� 2:�Ǿջ��� 3:�Ǿջ��� 4:�˻� 5:�ε������� 6:�ε������� 7:������ 8:������ 9:���� --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("����Ʈ����� �����մϴ�.");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("�Ǿջ����� �����մϴ�.");
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				list.addFirst(item);		// (3)
				break;
			case 3:
				System.out.println("�Ǿջ����� �����մϴ�.");
				System.out.println("������ ���� = " + list.removeFirst());	// (4)
				break;
			case 4:
				System.out.println("�˻��� �����մϴ�.");
				System.out.print("�˻��� ���� �Է�:");
				item = scan.nextInt();
				if(list.contains(item))			// (5)
					System.out.println("�˻� ����");
				else
					System.out.println("�˻� ����");
				break;
				
			case 5:
				System.out.println("�ε��������� �����մϴ�.");
				System.out.print("�ε��� �Է�:");
				index = scan.nextInt();
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				list.add(index, item);		// (6)
				break;
			case 6:
				System.out.println("�ε��������� �����մϴ�.");
				System.out.print("�ε��� �Է�:");
				index = scan.nextInt();
				System.out.println("������ ���� = " +list.remove(index));
				break;
			case 7:
				System.out.println("�������� �����մϴ�.");
				System.out.print("ã�� ���� �Է�: ");
				x = scan.nextInt();
				System.out.print("ã�� ���� �ڿ� ������ ���� �Է� :");
				y = scan.nextInt();
				list.addBehind(x, y);
				break;
			case 8:
				System.out.println("�������� �����մϴ�.");
				System.out.print("������ ���� �Է�: ");
				x = scan.nextInt();
				list.removeNum(x);
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�޴� ��ȣ ����: �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 9);
	}
}