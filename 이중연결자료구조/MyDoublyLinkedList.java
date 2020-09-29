/*
 * 파일명: MyDoublyLinkedList.java
 * 작성자: 홍준성
 * 작성일: 2017년 10월 1일
 * 내용: 이중연결자료구조로 선형리스트를 구현한 MyDoublyLinkedList 클래스
 */
package hw6_3;

public class MyDoublyLinkedList {

	private Node head;	// 리스트의 첫번째 노드를 가리킬 변수
	private int count;	// 리스트의 원소 수를 나타내는 변수

	public MyDoublyLinkedList() {
		head = null;
		count = 0;
	}

	// 리스트 길이를 리턴
	public int size() {
		return count;
	}

	// 리스트의 맨 앞에 item을 삽입
	public void addFirst(int item) {

		Node newNode = new Node(item);// (1) 데이터가 item인 새로운 노드 생성
		if(head==null)
			head = newNode;
		else {	
			newNode.rlink = head;// (2) 새로운 노드를 리스트의 맨 앞에 삽입
			head = newNode;
			newNode.rlink.llink = newNode;
		}
		// (3) 원소 수 1 증가
		count ++;
	}

	@Override
	public String toString() { //리스트를 모두 출력
		StringBuffer str = new StringBuffer("");
		str.append("[");
		Node temp = head;

		while(temp != null) {
			str.append(temp.data);
			temp = temp.rlink;
			if(temp != null)
				str.append(", ");
		}
		str.append("]");
		return str.toString(); 
	}
	// 리스트가 양방향연결이 제대로 이루어졌는지 확인
	public void printLink() {
		if (head == null) {
			System.out.println("공백리스트임");
		}
		else {
			// 리스트를 순방향으로 출력
			Node temp = head;
			System.out.print("리스트 길이=" + count + " 순방향 링크: ");
			while(temp.rlink != null) {
				System.out.print(temp.data + "->");
				temp = temp.rlink;
			}
			System.out.print(temp.data);

			// 리스트를 역방향으로 출력
			System.out.print(" 역방향 링크: ");
			while(temp.llink != null) {
				System.out.print(temp.data + "->");
				temp = temp.llink;
			}
			System.out.println(temp.data);
		}
	}
	// 리스트의 맨앞 원소를 삭제하고 반환
	public int removeFirst() {

		if(head == null) {
			System.out.print("공백리스트입니다.  ");
			return 0;
		}	
		if(head.rlink == null) {
			int tmp = head.data;
			head = null;
			count --;
			return tmp;
		}
		else {
			int tmp = head.data;
			head = head.rlink;
			head.llink = null;
			count--;
			return tmp;
		}
	}
	//정수값을 입력받아 리스트에서 삭제
	public void remove(int item) {
		Node tmp = head;

		while(tmp != null) {
			if(tmp.data == item) {
				if(tmp.llink==null & tmp.rlink ==null) {
					head = null;
					count --;
					break;
				}
				if(tmp.llink == null) {
					head = head.rlink;
					head.llink = null;
					count--;
					break;
				}
				if(tmp.rlink == null) {
					tmp.llink.rlink = null;
					tmp.llink = null;
					count--;
					break;
				}
				else {
					tmp.llink.rlink = tmp.rlink;
					tmp.rlink.llink = tmp.llink;
					count--;
					break;
				}
			}
			tmp = tmp.rlink;
		}
		if(tmp == null)
			System.out.println("삭제 실패");

	}
	// 이중연결리스트 노드 구조
	private class Node {
		int data;
		Node llink; 
		Node rlink;

		Node() {
			this(0, null, null);
		}
		Node(int data) {
			this(data, null, null);
		}
		Node(int data, Node llink, Node rlink) {
			this.data = data;
			this.llink = llink;
			this.rlink = rlink;
		}
	}
}


