package mid2_1;

public class Member {
	// (1) private �ʵ� : ����Ʈ(������)
	private int point;
	// (2) ����Ʈ�� �Ű������� �޾� �ʱ�ȭ�ϴ� ������	
	public Member(int point) {
		this.point = point;
	}
	// (3) getPoint() : ����Ʈ ���� �����ϴ� �޼ҵ�
	public int getPoint() {
		return point;
	}
	// (4) buy() : ���� �ݾ�(������)�� �Ű������� �޾�
	//           ���� �ݾ��� 1%�� ����Ʈ�� �������ִ� �޼ҵ�
	public void buy(int buyAmount) {
		point += buyAmount/100;
	}
}
