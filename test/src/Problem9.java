import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̼� ���� : ");
		int ���� = scan.nextInt();
		System.out.print("���� �̼� ���� : ");
		int ���� = scan.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		int �Ϲ� = scan.nextInt();
		
		if(����+����+�Ϲ� >= 140) {
			if(����>=30 && �Ϲ� >= 30 || ����+�Ϲ�>=80)
				System.out.println("���� ����");
			else
				System.out.println("���� �Ұ�");
		}
		else
			System.out.println("���� �Ұ�");
			
	}
}
