
/*
 * 파일명: InputTest.java
 * 작성일: 2018.3.15
 * 작성자: 홍준성
 * 내용:  Scanner 클래스를 이용한 입력을 연습하는 프로그램
 */

package lab2_1;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		System.out.println("lab2_1: 홍준성\n");

		Scanner input = new Scanner(System.in);
		System.out.print("도시명 입력: ");
		String city = input.nextLine();
		System.out.print("인구 입력(단위는 만명): ");
		int population = input.nextInt();
		System.out.print("평균 기온 입력: ");
		double averageDegree = input.nextDouble();

		System.out.println("");
		System.out.println("도시명 = "+ city);
		System.out.println("인구 = "+population+"만");
		System.out.println("평균 기온 = "+averageDegree);
	}
}
