/*
 * ���ϸ�: IntArray.java
 * �ۼ���: 2018.3.22
 * �ۼ���: ȫ�ؼ�
 * ����: �����迭 ���α׷� ���α׷�  
 */
package lab4_1;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		System.out.println("lab4_1: ȫ�ؼ�\n");
		Scanner input = new Scanner(System.in);//��ĳ�� ��ü ����

		System.out.print("�迭 ���� �Է�: ");
		int size = input.nextInt(); 
		int [] array = new int[size]; //������ �Է¹ޱ�

		System.out.print(size+"���� ���� �Է�: ");
		for(int i = 0; i<size; ++i) 
			array[i]=input.nextInt();
//�ι� ����ϱ�~
		System.out.print("�迭 = ");
		for(int i=0; i<size; i++) 
			System.out.print(array[i]+" ");

		System.out.println("");
		
		System.out.print("�迭 = ");
		for(int i=0; i<size; i++) 
			System.out.print(array[i]+" ");
	}
}
