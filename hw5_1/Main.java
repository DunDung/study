//���ϸ� : Main.java
//�ۼ��� : 201432041 ȫ�ؼ�
//�ۼ��� : 2017�� 9�� 20��
//���� : ���� ����Ʈ�� �����ϴ� MyList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷�
package hw5_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("hw5_1 : ȫ�ؼ�");

		int index1 = 0;//Main�� �ʿ��� ���� ����
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;

		Scanner input = new Scanner(System.in);		

		MyList list = new MyList(); //MyList ��ü�� ����

		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);

		System.out.println(list);
		System.out.println("����Ʈ ũ�� = "+list.size()); //����Ʈ�� ũ�⸦ ���

		System.out.print("��ȸ�� �ε��� �Է�: "); //�Է¹��� �ε����� list.get�޼ҵ带 ȣ����  ���
		index1 = input.nextInt();
		System.out.println(list.get(index1));

		System.out.print("777�� ������ �ε��� �Է�: ");//�Է¹��� �ε����� 777�� list.set�޼ҵ带 ȣ���� ���� 
		index2 = input.nextInt();
		list.set(index2, 777);
		System.out.println(list);

		System.out.print("999�� ������ �ε��� �Է�: "); //list.add�޼ҵ带 ȣ���ؼ� �Է¹��� �ε����� 999�� ����
		index3 = input.nextInt();
		list.add(index3, 999);
		System.out.println(list);

		System.out.print("������ �ε��� �Է�: ");//list.remove�޼ҵ带 ȣ���� �Է¹��� �ε����� ���� ����
		index4 = input.nextInt();
		System.out.println("�ε��� "+index4+"�� ���� = "+list.remove(index4));
		System.out.print(list);
	}
}
