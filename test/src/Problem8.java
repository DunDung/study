import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		String s = scan.next(); //���ڿ��� �Է¹޴´�.

		int sum = 0;
		//�ѱ��ھ� ��� ���ڷ� �ٲٰ� sum�� �����Ѵ�.
		for(int i=0; i<s.length(); i++)
			sum += Integer.parseInt(s.substring(i, i+1));
		
		System.out.println("�� �ڸ����� ��  = "+sum);
		
	}

}
