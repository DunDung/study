/*
 * 파일명: StudentCount.java
 * 작성일: 2018.3.22
 * 작성자: 홍준성
 * 내용: 하한 ~ 상한 범위의 여러 학생 나이를 입력받아 각 
 * 연령의 학생이 몇명씩인가를 세는 프로그램을 작성하시오.  
 */
import java.util.Scanner;

public class StudentCount {

	public static void main(String[] args) {
		System.out.println("hw4_1: 홍준성\n");
		Scanner input = new Scanner(System.in);

		int  count = 0; //숫자를 세줄 count변수 선언
		System.out.print("나이 하한 입력: ");
		int min = input.nextInt();//하한 입력받기
		System.out.print("나이 상한 입력: ");
		int max = input.nextInt();//상한 입력받기
		System.out.print("학생 수 입력: ");
		int student = input.nextInt();//학생수 입력


		int []array = new int[student]; //학생들의 나이를 저장할 첫번째 배열
		int []ageArray = new int[max+1-min]; //타당한 나이들을 저장할 두번째 배열
		while(count < student) {//while문으로 학생들의 나이를 첫번째 배열에 저장
			System.out.print("나이 입력: ");
			int age = input.nextInt();
			if(min<=age && max>=age) {
				array[count] = age;
				count ++; //count를 늘리며 배열의 크기만큼만 저장
			}
			else
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
		}
		count = 0; 
		for(int i=min; i<max+1; i++) { //타당한 모든 나이를 두번째 배열에 저장
			ageArray[count] = i;
			count++; 
		}
		System.out.println("나이  학생수");
		for(int i=0; i<ageArray.length; i++) { //하한과 상한사이의 나이를 첫번째 배열에서 찾아서 숫자 세기
			count = 0;
			for(int j = 0; j<array.length; j++) {
				if(ageArray[i] == array[j]) 
					count++;                
			}
			if(min<=max) 
				System.out.println(min+"   "+count);
			min++;
		}
	}
}
