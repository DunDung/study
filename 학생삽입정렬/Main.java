/* 
 * ���ϸ�: Main.java
 * �ۼ���: 2017.12.11
 * �ۼ���: ȫ�ؼ�
 * ����: ���� ���� �˰����� �̿��Ͽ� �л����� ���� �������� �������� �����ϴ� ���α׷� 
 */
package hw11_1;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("hw11_1 : ȫ�ؼ�\n");

		int stdnum, age; //�й��� ���̸� ������ ������ ����

		System.out.print("�л� �� �Է�: ");
		int n = input.nextInt(); //n�� �Է¹��� �л� ���� �ʱ�ȭ
		System.out.println("");

		Student s = new Student(); //insertionSort�Լ� ȣ���� ����
		Student[] Student= new Student[n]; //�Է¹��� �л����� n�� ũ�⸸ŭ Student�迭 ����

		for(int i=0; i<n; i++) {
			System.out.print(i+1 +"��° �л��� �й� �Է�: ");
			stdnum = input.nextInt();
			System.out.print(i+1 +"��° �л��� ���� �Է�: ");
			age = input.nextInt();
			Student[i] = new Student(stdnum, age); //��ü �迭�� �ϳ��ϳ� �ʱ�ȭ ����
		}

		System.out.println("");
		System.out.println(" ---���� ��---");
		for(int i=0; i<n; i++)
			System.out.println(Student[i]);

		System.out.println("");
		s.insertionSort(Student); //�������ĸ޼ҵ带 Student�迭�� ������� ȣ��

		System.out.println(" ---���� ��---");
		for(int i=0; i<n; i++)
			System.out.println(Student[i]);
	}
}
