//파일명 : Method2.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월 8일
//설명 : MyPair 클래스를 작성하고 사용하는 프로그램을
package lab0_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lab0_6 : 홍준성");
		int a = 0;
		int b = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("2개의 정수를 입력하세요 :");
		a = input.nextInt();
		b = input.nextInt();
		
		MyPair pair = new MyPair(a, b);
		
		System.out.println(pair.toString());
		System.out.println("합 = "+pair.sum());
		System.out.println("평균 = "+pair.average());
		
		pair.swap();
		
		System.out.println(pair.toString());
		System.out.println("합 = "+pair.sum());
		System.out.println("평균 = "+pair.average());
	}

}
