//파일명 : Method2.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월85일
//설명 : 사용자가 입력한 정수값 중에서 최대값과 인덱스를 알아내는 프로그램을

package lab0_5;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		
		System.out.println("lab0_5 : 홍준성");
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수의 갯수를 입력하세요: ");
		n = input.nextInt();
		
		int[] array = new int[n];
		System.out.print(n+"개의 정수를 입력하세요:");
		
		for(int i = 0; i < n; i++) 
			array[i] = input.nextInt();
		
		System.out.println("최대값 인덱스 = "+getMaxindex(array));
		System.out.println("최대값 = " +array[getMaxindex(array)]);
		}

	public static int getMaxindex(int array[]) {
		int max = array[0];
		int index = 0;
		
		for(int i = 1; i < array.length; i++) {
			if(max<array[i]) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}
}
