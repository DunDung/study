package mid2_2;

public class Account {
	private int id;  // ���̵�
	private int balance; // �ܾ�
	private double interestRate; // �ݸ�

	// ���̵� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	public Account(int id) {
		this(id, 3000, 0.03);
	}

	// ���̵�, �ܾ�, �ݸ��� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	public Account(int id, int balance, double interestRate) {
		this.id = id;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	// ���̵� �����ϴ� �޼ҵ�
	public int getId() {
		return id;
	}

	// ����(�ܾ� x �ݸ�)�� ����Ͽ� �����ϴ� �޼ҵ�
	public int getInterest() {
		return (int)(balance * interestRate);
	}
}


