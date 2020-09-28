/*
 * 파일명: Main.java
 * 작성일: 2018.5.31
 * 작성자: 홍준성
 */
package lab14_2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: 홍준성");
		Scanner scan = new Scanner(System.in);

		int x, y, result;
		try {
			System.out.print("정수 x 입력: ");
			x = scan.nextInt();
			System.out.print("정수 y 입력: ");
			y = scan.nextInt();
			result = x / y;
		}catch(ArithmeticException e1) { //0을 입력했을 때
			result = 0;
		}catch(InputMismatchException e2) { //문자를 입력했을 때
			result = 1;
		}
		
		System.out.println("result = " + result);
	}
}
