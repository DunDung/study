/*
 * 파일명: IntArray.java
 * 작성일: 2018.3.22
 * 작성자: 홍준성
 * 내용: 정수배열 프로그램 프로그램  
 */
package lab4_1;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		System.out.println("lab4_1: 홍준성\n");
		Scanner input = new Scanner(System.in);//스캐너 객체 생성

		System.out.print("배열 길이 입력: ");
		int size = input.nextInt(); 
		int [] array = new int[size]; //사이즈 입력받기

		System.out.print(size+"개의 정수 입력: ");
		for(int i = 0; i<size; ++i) 
			array[i]=input.nextInt();
//두번 출력하기~
		System.out.print("배열 = ");
		for(int i=0; i<size; i++) 
			System.out.print(array[i]+" ");

		System.out.println("");
		
		System.out.print("배열 = ");
		for(int i=0; i<size; i++) 
			System.out.print(array[i]+" ");
	}
}
