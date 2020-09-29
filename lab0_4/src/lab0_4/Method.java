//파일명 : Method.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월 5일
//설명 : 메소드를 호출하여 사용자가 입력한 정수값 중에서 최대값을 알아내는 프로그램

package lab0_4;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		System.out.println("lab0_4 : 홍준성");
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.print("최대값 = " +findMax(a, b));
	}
	public static int findMax(int a, int b) {
		if(a > b)
			return a;
		return b;	
	}
}
