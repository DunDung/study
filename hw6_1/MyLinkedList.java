package hw6_1;

public class MyLinkedList {
	private Node head; //�ν��Ͻ� ���� head ����: ���Ḯ��Ʈ�� ù��° ��带 ����Ŵ
	private int count; //���Ḯ��Ʈ�� ���̸� ���� ����count ����

	public MyLinkedList() { 	//����ִ� ����Ʈ�� ����
		head = null ;
		count = 0;
	}

	public void addFirst(int item) { //����Ʈ�� �� �տ� item�� �����ϴ� �޼ҵ�
		Node newNode = new Node(); // data �ʵ尡 item�� ���ο� Node ��ü�� ����(newNode)

		newNode.data = item;
		newNode.link = head;
		head= newNode; // head�� ����Ű�� ���Ḯ��Ʈ�� �� �տ� newNode�� ����

		count ++;
	}

	public int size() {	//����Ʈ�� ���̸� ����
		return count;
	}

	public void printList() { // ����Ʈ ���ҵ��� ��� ���
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

	// ����Ʈ���� item�� ����� ��带 Ž���ϴ� private �޼ҵ� -- lab6_1������ ������� ����
	private Node searchNode(int item) {
		Node temp = head;
		while(temp != null) {
			if(item == temp.data)  
				return temp;		// Ž�� ������ �ش� ��� ����
			else 
				temp = temp.link;
		}
		return temp;				// Ž�� ���н� null ����
	}

	public int removeFirst() { //����Ʈ�� �Ǿ��� �����ϴ� �޼ҵ�
		if(head==null) {
			System.out.println("������ ���Ұ� �����ϴ�.");
			return 0;
		}
		else {
			int old = head.data;
			head = head.link;
			count --;
			return old;
		}
	}

	public boolean contains(int item) { //����Ʈ�ȿ� item������ �ִ��� Ȯ���ϴ� �޼ҵ�
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

	public void add(int index, int num) { //�Է¹��� �ε����� �Է¹��� �������� �����ϴ� �޼ҵ�
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
				System.out.println("�߸��� �ε����Դϴ�.");
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

	public int remove(int index) { //�Է¹��� �ε����� �������� �����ϴ� �޼ҵ�
		Node tmp = head;
		Node old = null;
		if(index > count-1) {
			System.out.println("�߸��� �ε����Դϴ�.");
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

	public void addBehind(int x, int y) { //x, y�� �Է¹޾� ����Ʈ�� ù��° x �ڿ� y�� ����
		Node tmp = head;
		Node pre = new Node();

		if(head == null)
			System.out.println("���鸮��Ʈ �Դϴ�.");

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
			System.out.println("ã�� ������ �����ϴ�.");
	}

	public void removeNum(int x) { // x�� �Է¹޾� ����Ʈ�� ù��° x�� ����
		Node tmp = head;
		if(head == null)
			System.out.println("���鸮��Ʈ �Դϴ�");
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
				System.out.println("ã�� ������ �����ϴ�.");
		}
	}

	@Override
	public String toString() { //����Ʈ�� ��� ���
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

	// ���Ḯ��Ʈ ��� ������ ǥ���ϴ� private Ŭ����
	private class Node {
		int data  ;	 // (6) �������� ������ ������ �ʵ� data ����
		Node link;	 // (7) ���� ��� �������� ������ ��ũ �ʵ�link ����

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
