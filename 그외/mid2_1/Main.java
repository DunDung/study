package mid2_1;

public class Main {

	public static void main(String[] args) {
		// ����Ʈ�� 10���� �ʱ�ȭ �� ȸ�� ��ü�� ����
		Member m = new Member(10);

		// ����Ʈ ���
		System.out.println(m.getPoint()); // 10

		// ȸ���� 2000�� ����     
		m.buy(2000);

		// ����Ʈ ���
		System.out.println(m.getPoint());  // 30      

		// ȸ���� 3000�� ����     
		m.buy(3000);

		// ����Ʈ ���
		System.out.println(m.getPoint()); // 60
	}
}

