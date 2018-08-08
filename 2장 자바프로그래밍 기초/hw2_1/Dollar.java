/*
 * 파일명: Dollar.java
 * 작성일: 2018.3.15
 * 작성자: 홍준성
 * 내용: 저금통에 있는 달러를 한화로 환전하는 프로그램  
 */
package hw2_1;

import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {
		System.out.println("hw2_1: 홍준성\n");
		//스캐너 객채 생성
		Scanner input = new Scanner(System.in);
		//저금통에있는 동전들의 갯수를 입력 받기
		System.out.print("500원 갯수 입력: ");
		int fiveHundred = input.nextInt();
		System.out.print("100원 갯수 입력: ");
		int oneHundred = input.nextInt();
		System.out.print("50원 갯수 입력: ");
		int fifty = input.nextInt();
		System.out.print("10원 갯수 입력: ");
		int ten = input.nextInt();

		//저금 총액 계산
		int money = fiveHundred*500 + oneHundred*100 + fifty*50 + ten*10;
		int exchangeRate = 1060;

		System.out.println("\n저금 총액 = "+ money);
		System.out.println("달러 액수 = "+ money/exchangeRate);
		System.out.println("남은 한화 = "+ money%exchangeRate);
	}
}
