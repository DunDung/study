/*
 * ���ϸ�: MyDoublyLinkedList.java
 * �ۼ���: ȫ�ؼ�
 * �ۼ���: 2017�� 10�� 1��
 * ����: ���߿����ڷᱸ���� ��������Ʈ�� ������ MyDoublyLinkedList Ŭ����
 */
package hw6_3;

public class MyDoublyLinkedList {

	private Node head;	// ����Ʈ�� ù��° ��带 ����ų ����
	private int count;	// ����Ʈ�� ���� ���� ��Ÿ���� ����

	public MyDoublyLinkedList() {
		head = null;
		count = 0;
	}

	// ����Ʈ ���̸� ����
	public int size() {
		return count;
	}

	// ����Ʈ�� �� �տ� item�� ����
	public void addFirst(int item) {

		Node newNode = new Node(item);// (1) �����Ͱ� item�� ���ο� ��� ����
		if(head==null)
			head = newNode;
		else {	
			newNode.rlink = head;// (2) ���ο� ��带 ����Ʈ�� �� �տ� ����
			head = newNode;
			newNode.rlink.llink = newNode;
		}
		// (3) ���� �� 1 ����
		count ++;
	}

	@Override
	public String toString() { //����Ʈ�� ��� ���
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
	// ����Ʈ�� ����⿬���� ����� �̷�������� Ȯ��
	public void printLink() {
		if (head == null) {
			System.out.println("���鸮��Ʈ��");
		}
		else {
			// ����Ʈ�� ���������� ���
			Node temp = head;
			System.out.print("����Ʈ ����=" + count + " ������ ��ũ: ");
			while(temp.rlink != null) {
				System.out.print(temp.data + "->");
				temp = temp.rlink;
			}
			System.out.print(temp.data);

			// ����Ʈ�� ���������� ���
			System.out.print(" ������ ��ũ: ");
			while(temp.llink != null) {
				System.out.print(temp.data + "->");
				temp = temp.llink;
			}
			System.out.println(temp.data);
		}
	}
	// ����Ʈ�� �Ǿ� ���Ҹ� �����ϰ� ��ȯ
	public int removeFirst() {

		if(head == null) {
			System.out.print("���鸮��Ʈ�Դϴ�.  ");
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
	//�������� �Է¹޾� ����Ʈ���� ����
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
			System.out.println("���� ����");

	}
	// ���߿��Ḯ��Ʈ ��� ����
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


