/*
 * ���ϸ�: StudentCount.java
 * �ۼ���: 2018.3.22
 * �ۼ���: ȫ�ؼ�
 * ����: ���� ~ ���� ������ ���� �л� ���̸� �Է¹޾� �� 
 * ������ �л��� ����ΰ��� ���� ���α׷��� �ۼ��Ͻÿ�.  
 */
import java.util.Scanner;

public class StudentCount {

	public static void main(String[] args) {
		System.out.println("hw4_1: ȫ�ؼ�\n");
		Scanner input = new Scanner(System.in);

		int  count = 0; //���ڸ� ���� count���� ����
		System.out.print("���� ���� �Է�: ");
		int min = input.nextInt();//���� �Է¹ޱ�
		System.out.print("���� ���� �Է�: ");
		int max = input.nextInt();//���� �Է¹ޱ�
		System.out.print("�л� �� �Է�: ");
		int student = input.nextInt();//�л��� �Է�


		int []array = new int[student]; //�л����� ���̸� ������ ù��° �迭
		int []ageArray = new int[max+1-min]; //Ÿ���� ���̵��� ������ �ι�° �迭
		while(count < student) {//while������ �л����� ���̸� ù��° �迭�� ����
			System.out.print("���� �Է�: ");
			int age = input.nextInt();
			if(min<=age && max>=age) {
				array[count] = age;
				count ++; //count�� �ø��� �迭�� ũ�⸸ŭ�� ����
			}
			else
				System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���.");
		}
		count = 0; 
		for(int i=min; i<max+1; i++) { //Ÿ���� ��� ���̸� �ι�° �迭�� ����
			ageArray[count] = i;
			count++; 
		}
		System.out.println("����  �л���");
		for(int i=0; i<ageArray.length; i++) { //���Ѱ� ���ѻ����� ���̸� ù��° �迭���� ã�Ƽ� ���� ����
			count = 0;
			for(int j = 0; j<array.length; j++) {
				if(ageArray[i] == array[j]) 
					count++;                
			}
			if(min<=max) 
				System.out.println(min+"   "+count);
			min++;
		}
	}
}
