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
			System.out.println("������ �� ���ֽ��ϴ�.");
		else
			array[++top] = item;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) 
			throw new Exception("������ ����ֽ��ϴ�.");
		
		else
			return array[top--];
	}
	
	public int peek() throws Exception {
		if(isEmpty()) 
			throw new Exception("������ ����ֽ��ϴ�.");
		else
			return array[top];
	}
}


