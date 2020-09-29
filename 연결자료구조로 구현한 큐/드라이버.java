/*
 * 파일명: 드라이버.java
 * 작성자: 홍준성
 * 작성일: 2017년 11월 7일
 * 내용: int형 자료를 저장하는 큐를 연결자료구조로 구현하고 사용하는 프로그램을 작성하시오
 */
package hw8_2;

import java.util.Scanner;

public class 드라이버 {

	public static void main(String[] args) {
		System.out.println("hw8_2: 홍준성\n");
		MyLinkedQueue q = new MyLinkedQueue();
		Scanner input = new Scanner(System.in);

		System.out.println("메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;
		int index = 0;

		// 종료를 선택할 때까지 반복하여 메뉴를 제공하고 그에 맞는 작업을 수행
		do {
			System.out.print("1:삽입 2:삭제 3:전체삭제 4:종료 --->");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("정수 입력 : ");
				item = input.nextInt();
				q.enQueue(item);
				break;
			case 2:
				System.out.println(q.deQueue());
				break;
			case 3:
				while(!q.isEmpty()) //큐가 비어있는 상태일때까지 deQueue를 한다.
					System.out.println(q.deQueue());
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 4);

	}
}

