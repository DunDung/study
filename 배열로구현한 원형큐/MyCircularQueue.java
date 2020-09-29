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
		this.capacity = queueSize; //큐의 용량을 나타내는 capacity변수에 사용자가 입력란 queueSize값을 삽입
		array = new int[queueSize]; //사용자가 정한크기의 배열 생성
	}

	public boolean isEmpty() { //count가 0일때 스택이 비어있는 상태, count를 씀으로써 비어있는 공간이 없이 전부 사용할 수 있음
		return (count == 0);
	}

	public boolean isFull() { //count가 큐의 크기와 같을때 가득 차있는 상태
		return (count == capacity);
	}

	public void enQueue(int item) {
		if(isFull())
			System.out.println("스택이 꽉 차 있습니다.");
		else {
			rear = (rear+1) % capacity; //용량만큼 나머지 연산을 실행하여 용량 위로는 값이 올라가지 않음
			array[rear] = item;
			count ++;
		}
	}

	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException("스택이 비어있습니다."); //NoSuchElementException를 사용하여 에러메시지 출력
		else {
			front = (front+1) % capacity;
			count --;
			return array[front];
		}
	}
}
