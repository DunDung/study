/*
 * 파일명: StringTest.java
 * 작성일: 2018.4.5
 * 작성자: 홍준성
 * 내용: 아래 첨부한 코드를 이용하여 String 클래스 연습 프로그램
 */
package lab5_5;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {

		System.out.println("lab5_5: 홍준성");

		// (1) 사용자로부터 길이가 5 이상인 두 개의 문자열 s1, s2를 입력받음
		Scanner input = new Scanner(System.in);
		System.out.print("길이가 5 이상인 문자열 s1 입력:");
		String s1 = input.nextLine();
		System.out.print("길이가 5 이상인 문자열 s2 입력:");
		String s2 = input.nextLine();

		System.out.println(s1.length()); //길이출력
		System.out.println(s1.charAt(0)); //첫번째문자 출력
		System.out.println(s1.substring(1, 4)); //두번째~네번째 문자 출력
		System.out.println(s1.toUpperCase());//대문자로 변경한 결과 출력
		System.out.println(s1.equals(s2)); //동일한지 여부 출력
		System.out.println(s1.equalsIgnoreCase(s2));//대소문자 무시하고 동일한지 여부 출력
		System.out.println(s1.compareTo(s2)); //사전적으로 비교한 결과 출력
	}
}