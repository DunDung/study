/*
 * 파일명: arraySum.java
 * 작성일: 2018.3.27
 * 작성자: 홍준성
 * 내용: 배열 원소의 합을 구하는 프로그램  
 */
package lab4_2;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("lab4_2: 홍준성\n");
		Scanner input = new Scanner(System.in);

		System.out.print("정수 갯수 입력: ");
		int n = input.nextInt();
		int [] array = new int[n];
		System.out.print("정수 "+n+"개 입력: ");

		for(int i = 0; i<array.length; i++)
			array[i] = input.nextInt();

		System.out.println("합 = "+getSum(array));

	}
	static int getSum(int [] a) { //for each를 이용해서 sum에 합을 저장 후 리턴
		int sum = 0;
		for(int i : a) 
			sum += i;
		return sum;
	}

}
