package mid2_1;

public class Member {
	// (1) private 필드 : 포인트(정수형)
	private int point;
	// (2) 포인트를 매개변수로 받아 초기화하는 생성자	
	public Member(int point) {
		this.point = point;
	}
	// (3) getPoint() : 포인트 값을 리턴하는 메소드
	public int getPoint() {
		return point;
	}
	// (4) buy() : 구매 금액(정수형)을 매개변수로 받아
	//           구매 금액의 1%를 포인트로 적립해주는 메소드
	public void buy(int buyAmount) {
		point += buyAmount/100;
	}
}
