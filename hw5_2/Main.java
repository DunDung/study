//파일명 : Main.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월 20일
//설명 : java.util 패키지의 ArrayList 클래스를 이용한 My List
package hw5_2;

import java.util.ArrayList; //ArrayList를 import
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("hw5_2 : 홍준성");

		int index1 = 0;//변수 선언
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); //list 객체를 생성

		list.add(20); //list에 20을 저장
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);

		System.out.println(list); //list를 출력

		System.out.println("리스트 크기 = "+list.size()); //list의 크기를 출력

		System.out.print("조회할 인덱스 입력: ");//사용자로부터 입력받은 인덱스의 값을 출력
		index1 = input.nextInt();
		System.out.println(list.get(index1));

		System.out.print("777로 갱신할 인덱스 입력: "); //사용자로부터 입력받은 인덱스의 값을 777로 갱신 
		index2 = input.nextInt();
		list.set(index2, 777);
		System.out.println(list);

		System.out.print("999를 삽입할 인덱스 입력: ");//사용자로부터 입력받은 인덱스에 999를 삽입
		index3 = input.nextInt();
		list.add(index3, 999);
		System.out.println(list);

		System.out.print("삭제할 인덱스 입력: ");//사용자로부터 입력받은 인덱스의 값을 삭제
		index4 = input.nextInt();
		System.out.println("인덱스 "+index4+"의 원소 = "+list.remove(index4));
		System.out.print(list);
	}
}
