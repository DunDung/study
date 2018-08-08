/*
 * 파일명: MemberTest.java
 * 작성일: 2018.5.17
 * 작성자: 홍준성
 * 내용: 회원을 abstract class로 정의하고, 이를 상속하는 시간제회원, 정회원 클래스를 정의하고 이용하는 프로그램을 
*/
package hw7_2;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw7_2: 홍준성");
		
		double averageAge = 0;
		int paymentSum = 0;
		Member [] m = new Member[4]; //(1) 크기가 4인 Member 배열을 생성
		
		m[0] = new HourlyMember(22, 2);
		m[1] = new HourlyMember(33, 3);
		m[2] = new RegularMember(44);
		m[3] = new RegularMember(55);
	
		for(int i = 0; i<4; i++) {  //나이 평균과 회비의 합을 구하기 위한 반복문
			averageAge += m[i].getAge();
			paymentSum += m[i].getPayment();
		}
		System.out.println("나이 평균 = "+averageAge/m.length); //(3) 회원의 나이 평균을 구해 출력
		System.out.println("회비 합 = "+paymentSum); //(4) 회원의 회비 합을 구해 출력
	}
		
		
}
