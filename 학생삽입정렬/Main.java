/* 
 * 파일명: Main.java
 * 작성일: 2017.12.11
 * 작성자: 홍준성
 * 설명: 삽입 정렬 알고리즘을 이용하여 학생들을 나이 기준으로 오름차순 정렬하는 프로그램 
 */
package hw11_1;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("hw11_1 : 홍준성\n");

		int stdnum, age; //학번과 나이를 저장할 변수를 생성

		System.out.print("학생 수 입력: ");
		int n = input.nextInt(); //n을 입력받은 학생 수로 초기화
		System.out.println("");

		Student s = new Student(); //insertionSort함수 호출을 위한
		Student[] Student= new Student[n]; //입력받은 학생수인 n의 크기만큼 Student배열 생성

		for(int i=0; i<n; i++) {
			System.out.print(i+1 +"번째 학생의 학번 입력: ");
			stdnum = input.nextInt();
			System.out.print(i+1 +"번째 학생의 나이 입력: ");
			age = input.nextInt();
			Student[i] = new Student(stdnum, age); //객체 배열을 하나하나 초기화 해줌
		}

		System.out.println("");
		System.out.println(" ---정렬 전---");
		for(int i=0; i<n; i++)
			System.out.println(Student[i]);

		System.out.println("");
		s.insertionSort(Student); //삽입정렬메소드를 Student배열을 대상으로 호출

		System.out.println(" ---정렬 후---");
		for(int i=0; i<n; i++)
			System.out.println(Student[i]);
	}
}
