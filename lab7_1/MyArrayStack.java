package lab7_1;

public class MyArrayStack {
	private int top;
	private int	stackSize;
	private int[] array;
	
	public MyArrayStack(int size) {
		top = -1;
		stackSize = size;
		array = new int[size];
	}
	private boolean isFull() {
		return (top == stackSize -1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(int item) {
		if(isFull())
			System.out.println("스택이 꽉 차있습니다.");
		else
			array[++top] = item;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) 
			throw new Exception("스택이 비어있습니다.");
		
		else
			return array[top--];
	}
	
	public int peek() throws Exception {
		if(isEmpty()) 
			throw new Exception("스택이 비어있습니다.");
		else
			return array[top];
	}
}


