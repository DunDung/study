/*
 * ���ϸ�: Multiplication.java
 * �ۼ���: 2018.3.20
 * �ۼ���: ȫ�ؼ�
 * ����: �����뿡 �ִ� �޷��� ��ȭ�� ȯ���ϴ� ���α׷�  
 */
package hw3_1;
import java.util.Random;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("hw3_1:ȫ�ؼ�\n");
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		//�ʿ��� ������ ����
		int ans;
		int o = 0;
		int x = 0;
		int score = 0;
		
		System.out.println("���� ������ ���� �Է��ϼ���(����Ϸ��� 0�� �Է�)\n");
		for(int i = 0; i<5; i++) {
			int n1 = generator.nextInt(9)+1;
			int n2 = generator.nextInt(9)+1;
			System.out.print(n1+" * "+n2+" = ? ");
			ans = scan.nextInt();
			//�����ϰ��
			if(ans == n1*n2) {
				System.out.println("�����Դϴ�.");
				o++;
				score+=20;
			}//0�� �Է��� ���
			else if(ans == 0)
				System.out.println("���");
			else {//Ʋ�������
				System.out.println("Ʋ�Ƚ��ϴ�.");
				x++;
				if(score > 0)
					score -=10;
			}
			System.out.println("");
		}
		if(score < 0)
			score = 0;
		
		System.out.print("�����"+o+" �����"+x+" ����"+score+" --> ");
		if(score >= 50)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}
}

