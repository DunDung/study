//���ϸ� : Main.java
//�ۼ��� : 201432041 ȫ�ؼ�
//�ۼ��� : 2017�� 9�� 20��
//���� : java.util ��Ű���� ArrayList Ŭ������ �̿��� My List
package hw5_2;

import java.util.ArrayList; //ArrayList�� import
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("hw5_2 : ȫ�ؼ�");

		int index1 = 0;//���� ����
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); //list ��ü�� ����

		list.add(20); //list�� 20�� ����
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);

		System.out.println(list); //list�� ���

		System.out.println("����Ʈ ũ�� = "+list.size()); //list�� ũ�⸦ ���

		System.out.print("��ȸ�� �ε��� �Է�: ");//����ڷκ��� �Է¹��� �ε����� ���� ���
		index1 = input.nextInt();
		System.out.println(list.get(index1));

		System.out.print("777�� ������ �ε��� �Է�: "); //����ڷκ��� �Է¹��� �ε����� ���� 777�� ���� 
		index2 = input.nextInt();
		list.set(index2, 777);
		System.out.println(list);

		System.out.print("999�� ������ �ε��� �Է�: ");//����ڷκ��� �Է¹��� �ε����� 999�� ����
		index3 = input.nextInt();
		list.add(index3, 999);
		System.out.println(list);

		System.out.print("������ �ε��� �Է�: ");//����ڷκ��� �Է¹��� �ε����� ���� ����
		index4 = input.nextInt();
		System.out.println("�ε��� "+index4+"�� ���� = "+list.remove(index4));
		System.out.print(list);
	}
}
