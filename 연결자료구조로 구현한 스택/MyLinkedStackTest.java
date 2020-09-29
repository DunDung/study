/*
 * 파일명: MyLinkedStackTest.java
 * 작성자: 홍준성
 * 작성일: 2017년 10월 26일
 * 내용: 내부적으로 연결 자료구조로 구현한 정수 스택 추상자료형인 MyLinkedStack을 정의하고 이를 이용하는 프로그램을 작성하시오
 */

import java.util.Scanner;

public class MyLinkedStackTest  {
	public static void main(String[] args) throws Exception {
		System.out.println("lab7_2: 홍준성\n");

		MyLinkedStack s = new MyLinkedStack();
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;
		int index = 0;

		// 종료를 선택할 때까지 반복하여 메뉴를 제공하고 그에 맞는 작업을 수행
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:전체삭제 5:종료 --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("정수 입력 : ");
				item = scan.nextInt();
				s.push(item);
				break;
			case 2:
				System.out.println(s.pop());
				break;
			case 3:
				System.out.println(s.peek());
				break;
			case 4:
				while(s.isEmpty() == false)
					System.out.println(s.pop());
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 5);

	}

}

