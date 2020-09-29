
public class MyLinkedStack {
	private Node top;

	public boolean isEmpty() {
		return top == null;
	}
	public void push(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public int pop() throws Exception {
		if(isEmpty())
			throw new Exception("������ ����ֽ��ϴ�.");
		else {
		int item = top.data;
		top = top.link;
		return item;
		}
	}
	public int peek() throws Exception {
		if(isEmpty())
			throw new Exception("������ ����ֽ��ϴ�.");
		else
		return top.data;
	}
}

class Node {
	int data;
	Node link;
}