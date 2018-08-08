package hw6_2;

public class BankAccount {
	private int accountNumber; //���¹�ȣ
	private String accountName; //������
	private int balance;//�ܾ�
	
	//���¹�ȣ, �����ָ�, �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor 
	public BankAccount(int accountNumber, String accountName, int balance) {
		this.accountNumber =accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		if(this.balance<0)
			this.balance = 0;
	}
	//���¹�ȣ, �����ָ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor 
	public BankAccount(int accountNumber, String accountName) { //���¹�ȣ getter 
		this(accountNumber, accountName, 0);
	}
	public int getAccountNumber() { //���¹�ȣ getter 
		return accountNumber;
	}
	public String getAccountName() { //�����ָ� getter
		return accountName;
	}
	public void setAccountName(String accountName) { //�����ָ� setter
		this.accountName = accountName;
	}
	public int getBalance() { //�ܾ� getter
		return balance;
	}
	public void deposit(int balance) { //�Ա�
		if(balance >= 0)
			this.balance += balance;
		else
			System.out.println("����� �Է��ϼ���.");
	}
	public void withdraw(int balance) { // ��� - �ܾ� ������ ����� �̷������ �ʰ� ���� �޽��� ���
		if(0 > this.balance - balance)
			System.out.println("�ܾ׺���");
		else if(balance < 0) System.out.println("����� �Է��ϼ���.");
		else
			this.balance -= balance;
	}
	@Override 
	public String toString() { //toString() - ���¹�ȣ, �����ָ�, �ܾ��� ���ڿ��� ���� 
		return "���¹�ȣ = "+getAccountNumber()+", �����ָ� = " +getAccountName()+", �ܾ� = "+balance;
	}
	//�۱� - �ٸ� ������� ��ü�� �۱ݾ��� �Ű������� �޾� �� ���·κ��� �ٸ� ���·� �۱� �� ������ �ܾ� ������ �۱��� �̷������ �ʰ� ���� �޽��� ���
	public void transfer(BankAccount a, int balance) {
		if(0 > this.balance - balance)
			System.out.println("�ܾ׺���");
		else if(balance < 0) System.out.println("����� �Է��ϼ���.");
		else {
			withdraw(balance);
			a.deposit(balance);
		}
	}
}
