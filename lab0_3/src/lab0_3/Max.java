//파일명 : Max.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월 5일
//설명 : 사용자가 입력한 정수값 중에서 최대값을 알아내는 프로그램

package lab0_3;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		
		System.out.println("lab0_3 : 홍준성");
		
		int num = 0;
		int max = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수의 갯수를 입력하세요: ");
		num = input.nextInt();
		
		int[] array = new int[num];
		System.out.print(num + "개의 정수를 입력하세요: ");
		
		for (int i = 0; i < num; i++) 
			array[i] = input.nextInt();
		
		max = array[0];
		
		for(int i = 1; i < num; i++) {
			if(max < array[i])
				max = array[i];
		}
		System.out.print("최대값 = " +max);
	}
}