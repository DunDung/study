package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	private Node front;
	private Node rear;
	
	public void LinkedQueue() { //����ִ� ����Ʈ ����
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {  //front�� null�϶�
		return (front == null);
	}
	
	public void enQueue(int item) {
		Node newNode = new Node();
		newNode.data = item;
		
		if(isEmpty()) { //����Ʈ�� ����������� front�� rear�� �Ѵ� newNode�� ����Ų��.
			front = newNode;
			rear = newNode;
		}
		else { //�ǵڻ��� ����
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	public int deQueue() { 
		if(isEmpty()) 
			throw new NoSuchElementException("������ ����ֽ��ϴ�."); //����Ʈ�� ����������� NoSuchElementException ���ܸ� �߻�
		else { //�Ǿջ���
			int item = front.data;
			front = front.link;
			if(front == null) //�Ǿջ��� �� ����Ʈ�� ����ִ� ��� rear�� null�� �����.
				rear = null;
			return item;
		}
	}
	
	private class Node {
		int data;
		Node link;
	}
}



