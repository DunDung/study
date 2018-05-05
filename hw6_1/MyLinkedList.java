package hw6_1;

public class MyLinkedList {
	private Node head; //인스턴스 변수 head 선언: 연결리스트의 첫번째 노드를 가리킴
	private int count; //연결리스트의 길이를 세는 변수count 선언

	public MyLinkedList() { 	//비어있는 리스트를 생성
		head = null ;
		count = 0;
	}

	public void addFirst(int item) { //리스트의 맨 앞에 item을 삽입하는 메소드
		Node newNode = new Node(); // data 필드가 item인 새로운 Node 객체를 생성(newNode)

		newNode.data = item;
		newNode.link = head;
		head= newNode; // head가 가리키는 연결리스트의 맨 앞에 newNode를 삽입

		count ++;
	}

	public int size() {	//리스트의 길이를 리턴
		return count;
	}

	public void printList() { // 리스트 원소들을 모두 출력
		Node temp = head;
		System.out.print("[");
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.link;
			if(temp != null)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	// 리스트에서 item이 저장된 노드를 탐색하는 private 메소드 -- lab6_1에서는 사용하지 않음
	private Node searchNode(int item) {
		Node temp = head;
		while(temp != null) {
			if(item == temp.data)  
				return temp;		// 탐색 성공시 해당 노드 리턴
			else 
				temp = temp.link;
		}
		return temp;				// 탐색 실패시 null 리턴
	}

	public int removeFirst() { //리스트의 맨앞을 삭제하는 메소드
		if(head==null) {
			System.out.println("삭제할 원소가 없습니다.");
			return 0;
		}
		else {
			int old = head.data;
			head = head.link;
			count --;
			return old;
		}
	}

	public boolean contains(int item) { //리스트안에 item정수가 있는지 확인하는 메소드
		Node tmp = head;
		boolean a = false;

		while(tmp != null) {
			if(tmp.data == item) {
				a = true;
				return a;
			}
			else
				tmp = tmp.link;
		}
		return a;
	}

	public void add(int index, int num) { //입력받은 인덱스에 입력받은 정수값을 삽입하는 메소드
		Node tmp = head;
		Node newNode = new Node(num);

		switch(index) {
		case 0 :
			newNode.link = head;
			head = newNode;
			count ++;
			break ;
		default:
			if(index > count) {
				System.out.println("잘못된 인덱스입니다.");
				break;
			}
			else {
				for(int i = 1; i < index; i++) 
					tmp = tmp.link;

				newNode.link= tmp.link;
				tmp.link = newNode;
				count ++;
			}
		}
	}

	public int remove(int index) { //입력받은 인덱스의 정수값을 삭제하는 메소드
		Node tmp = head;
		Node old = null;
		if(index > count-1) {
			System.out.println("잘못된 인덱스입니다.");
			return 0;
		}
		if(index == 0) {
			tmp = head;
			head = tmp.link;
			count --;
			return tmp.data;
		}
		else {
			for(int i = 1; i < index; i++)
				tmp = tmp.link;

			old = tmp.link;
			tmp.link = old.link;
			count --;
			return old.data;
		}
	}

	public void addBehind(int x, int y) { //x, y를 입력받아 리스트의 첫번째 x 뒤에 y를 삽입
		Node tmp = head;
		Node pre = new Node();

		if(head == null)
			System.out.println("공백리스트 입니다.");

		while(tmp != null) {
			if(tmp.data == x) { 
				pre.data = y;
				pre.link = tmp.link;
				tmp.link = pre;
				count ++;
				break;
			}
			tmp = tmp.link;
		}
		if(pre.data != y)
			System.out.println("찾는 정수가 없습니다.");
	}

	public void removeNum(int x) { // x를 입력받아 리스트의 첫번째 x를 삭제
		Node tmp = head;
		if(head == null)
			System.out.println("공백리스트 입니다");
		else {
			Node pre = tmp.link;

			while(pre != null) {
				if(tmp.data == x) { 
					head = tmp.link;
					break;
				}
				if(pre.data == x) {
					if(pre.link == null) {
						tmp.link = null;
						break;
					}
					else {
						tmp.link = pre.link;
						break;
					}
				}
				tmp = tmp.link;
				pre = pre.link;
			}
			if(pre == null)
				System.out.println("찾는 정수가 없습니다.");
		}
	}

	@Override
	public String toString() { //리스트를 모두 출력
		StringBuffer str = new StringBuffer("");
		str.append("[");
		Node temp = head;

		while(temp != null) {
			str.append(temp.data);
			temp = temp.link;
			if(temp != null)
				str.append(", ");
		}
		str.append("]");
		return str.toString(); 
	}

	// 연결리스트 노드 구조를 표현하는 private 클래스
	private class Node {
		int data  ;	 // (6) 정수값을 저장할 데이터 필드 data 선언
		Node link;	 // (7) 다음 노드 참조값을 저장할 링크 필드link 선언

		Node() {
			data = 0;
			link = null;
		}

		Node(int data) {
			this.data = data;
			this.link = null;
		}

		Node(int data, Node link) {
			this.data = data;
			this.link = link;
		}
	}
}
