package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	private int front;
	private int rear; 
	private int capacity; 
	private int[] array;
	private int count;

	public MyCircularQueue(int queueSize) {
		front = 0;
		rear = 0;
		count = 0;
		this.capacity = queueSize; //ť�� �뷮�� ��Ÿ���� capacity������ ����ڰ� �Է¶� queueSize���� ����
		array = new int[queueSize]; //����ڰ� ����ũ���� �迭 ����
	}

	public boolean isEmpty() { //count�� 0�϶� ������ ����ִ� ����, count�� �����ν� ����ִ� ������ ���� ���� ����� �� ����
		return (count == 0);
	}

	public boolean isFull() { //count�� ť�� ũ��� ������ ���� ���ִ� ����
		return (count == capacity);
	}

	public void enQueue(int item) {
		if(isFull())
			System.out.println("������ �� �� �ֽ��ϴ�.");
		else {
			rear = (rear+1) % capacity; //�뷮��ŭ ������ ������ �����Ͽ� �뷮 ���δ� ���� �ö��� ����
			array[rear] = item;
			count ++;
		}
	}

	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException("������ ����ֽ��ϴ�."); //NoSuchElementException�� ����Ͽ� �����޽��� ���
		else {
			front = (front+1) % capacity;
			count --;
			return array[front];
		}
	}
}
