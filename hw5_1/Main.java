//파일명 : Main.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월 20일
//설명 : 정수 리스트를 관리하는 MyList 클래스를 작성하고 사용하는 프로그램
package hw5_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("hw5_1 : 홍준성");

		int index1 = 0;//Main에 필요한 변수 선언
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;

		Scanner input = new Scanner(System.in);		

		MyList list = new MyList(); //MyList 객체를 생성

		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);

		System.out.println(list);
		System.out.println("리스트 크기 = "+list.size()); //리스트의 크기를 출력

		System.out.print("조회할 인덱스 입력: "); //입력받은 인덱스를 list.get메소드를 호출해  출력
		index1 = input.nextInt();
		System.out.println(list.get(index1));

		System.out.print("777로 갱신할 인덱스 입력: ");//입력받은 인덱스에 777을 list.set메소드를 호출해 갱신 
		index2 = input.nextInt();
		list.set(index2, 777);
		System.out.println(list);

		System.out.print("999를 삽입할 인덱스 입력: "); //list.add메소드를 호출해서 입력받은 인덱스에 999를 삽입
		index3 = input.nextInt();
		list.add(index3, 999);
		System.out.println(list);

		System.out.print("삭제할 인덱스 입력: ");//list.remove메소드를 호출해 입력받은 인덱스의 값을 삭제
		index4 = input.nextInt();
		System.out.println("인덱스 "+index4+"의 원소 = "+list.remove(index4));
		System.out.print(list);
	}
}
