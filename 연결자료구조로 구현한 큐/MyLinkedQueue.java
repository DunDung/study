package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	private Node front;
	private Node rear;
	
	public void LinkedQueue() { //비어있는 리스트 생성
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {  //front가 null일때
		return (front == null);
	}
	
	public void enQueue(int item) {
		Node newNode = new Node();
		newNode.data = item;
		
		if(isEmpty()) { //리스트가 비어있을때는 front와 rear가 둘다 newNode를 가리킨다.
			front = newNode;
			rear = newNode;
		}
		else { //맨뒤삽입 실행
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	public int deQueue() { 
		if(isEmpty()) 
			throw new NoSuchElementException("스택이 비어있습니다."); //리스트가 비어있을때는 NoSuchElementException 예외를 발생
		else { //맨앞삭제
			int item = front.data;
			front = front.link;
			if(front == null) //맨앞삭제 후 리스트가 비어있는 경우 rear도 null로 만든다.
				rear = null;
			return item;
		}
	}
	
	private class Node {
		int data;
		Node link;
	}
}



