/*
 * 파일명: Main.java
 * 작성일: 2018.5.4
 * 작성자: 홍준성
 * 내용: 은행 계좌 프로그램
 */
package mid2_2;

public class Main {

	public static void main(String[] args) {
		System.out.println("mid2_2: 홍준성");
		// (1)아이디 11인 계좌 acc1 생성
		Account acc1 = new Account(11);
		// (2)아이디 22, 잔액 2000, 금리 0.06인 계좌 acc2 생성   
		Account acc2 = new Account(22, 2000, 0.06);
		// acc1과 acc2을 비교하는 메소드 호출
		compare(acc1, acc2);
		compare(acc2, acc1); 
	}

	// (3) 매개변수로 받은 은행계좌 a1, a2중에서 이자가 많은
	//     계좌의 아이디를 출력하는 메소드
	// -이자가 동일하면 동일하다고 출력할 것
	private static void compare(Account a1, Account a2){ 
		if(a1.getInterest()>a2.getInterest())
			System.out.println(a1.getId());
		else if(a1.getInterest()<a2.getInterest())
			System.out.println(a2.getId());
		else
			System.out.println("동일하다");
	}
}
