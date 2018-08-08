package mid2_1;

public class Main {

	public static void main(String[] args) {
		// 포인트를 10으로 초기화 한 회원 객체를 생성
		Member m = new Member(10);

		// 포인트 출력
		System.out.println(m.getPoint()); // 10

		// 회원이 2000원 구매     
		m.buy(2000);

		// 포인트 출력
		System.out.println(m.getPoint());  // 30      

		// 회원이 3000원 구매     
		m.buy(3000);

		// 포인트 출력
		System.out.println(m.getPoint()); // 60
	}
}

