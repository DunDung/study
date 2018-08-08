/*
 * 파일명: MemberTest.java
 * 작성일: 2018.4.5
 * 작성자: 홍준성
 * 내용: 두개의 클래스로 구성된 회원 프로그램
 */
package hw5_1;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw5_1: 홍준성");
		Member [] m = new Member[5]; //(1) 회원 5명을 생성 - 회원 배열을 사용할 것
		for(int i =0; i<5; i++) {
			m[i] = new Member();
			m[i].setGrade(i+1); //(2) 회원 5명의 등급을 1, 2, 3, 4, 5로 지정 - 회원등급지정 메소드 5번 호출
			m[i].addPoing(); //(3) 회원 5명에게 포인트 지급 - 포인트지급 메소드 5번 호출
			m[i].addPoing();//(3) 회원 5명에게 포인트 지급 - 포인트지급 메소드 5번 호출
			//(5) 회원 5명의 할인률을 조회하여 출력 - 할인률조회메소드 5번 호출
			System.out.println(i+1 + "번째 회원의 할인율 = "+m[i].getDiscountRate()); 
		}
	}
}
