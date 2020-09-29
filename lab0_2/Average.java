
//파일명 : Average.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월 4일
//설명 : 사용자가 입력한 10개의 정수값 중 평균값과 평균값 이상인 값을 출력하는 프로그램

package lab0_2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("lab0_2 : 홍준성");
		Scanner input = new Scanner(System.in);
		int[] ave = new int[10];
		System.out.println("10개의 정수를 입력하세요.");
		
		for (int i = 0; i < 10; i++) 
			ave[i] = input.nextInt();		
		
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += ave[i];
		}
		
		sum = sum / 10;
		System.out.println("평균 = " + sum);
		System.out.print("평균 이상인 값 =");
		
		for(int i = 0; i < 10; i++) {
			if (ave[i] >= sum)
			   System.out.print(ave[i] + " ");
		}
	}
}
