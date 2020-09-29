/* 
 * ���ϸ�: MyBinarySearchTree.java
 * �ۼ���: 2017.11.28
 * �ۼ���: ȫ�ؼ�
 * ����: int�� Ű�� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */
package hw9_2;


import java.util.NoSuchElementException;

class MyBinarySearchTree {
	// Ʈ���� ��Ʈ ��带 ����ų �ν��Ͻ� ���� root �����ϰ� null�� �ʱ�ȭ
	private Node root = null;



	// Ʈ���� ��带 ǥ���ϴ� Ŭ���� - �ʵ�(int�� key, leftChild, rightChild), ������(key���� �Ű������Ͽ� �ʱ�ȭ)
	private class Node {
		int key;
		Node leftChild;
		Node rightChild;

		Node(int key) {
			this.key = key;
		}
	}

	// (1) ��ü��ȸ�� ���� toString() �������̵�
	@Override
	public String toString() {
		String result = inorder(root);
		return result;
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ���ڿ��� �����ϴ� �޼ҵ�(��� �˰���)
	private String inorder(Node p) {
		String result = "";
		if(p != null) {
			result += inorder(p.leftChild);
			result += p.key + " ";
			result += inorder(p.rightChild);
		}
		return result;
	}

	// (2) ��� ����
	public void insert(int key) {  
		root = insertKey(root, key);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� key�� �����ϴ� �޼ҵ� (��� �˰���)
	private Node insertKey(Node p, int key) {
		if(p == null) {		
			Node newNode = new Node(key);
			return newNode;	
		}
		else if(key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p;		// ��Ʈ �Һ�
		}
		else if(key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p;		// ��Ʈ �Һ�        
		}
		else {  // key = p.key �� ��� ���� ����
			System.out.println("Insertion fail! key duplication : " + key);
			return p;  	// ��Ʈ �Һ�
		}
	}   

	// (3) ���� ��ȸ
	public void printPostorder() {
		postorder(root);
		System.out.println();
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ����ϴ� �޼ҵ�
	private void postorder(Node p) {

		if(p!=null) {
			postorder(p.leftChild);
			postorder(p.rightChild);
			System.out.print(p.key+" ");
		}
	}
	// p�� ��Ʈ�� �ϴ� Ʈ���� ���ƴٴϸ� item�� �˻����ִ� �޼ҵ�
	public boolean contains(int item) {
		Node p = root;
		while(p != null) {
			if(item == p.key) 
				return true;
			if(item < root.key) 
				p = p.leftChild;
			else
				p = p.rightChild;
		}
		return false;
	}
	// p�� ��Ʈ�� �ϴ� Ʈ���� �ִ밪�� �����ϴ� �޼ҵ�
	public int max() {
		Node p = root;
		if(p == null)
			throw new NoSuchElementException("Ʈ���� ����ֽ��ϴ�.");
		else {
			while(p.rightChild != null) 
				p = p.rightChild;
			return p.key;
		}
	}
	//p�� ��Ʈ���ϴ� Ʈ���� �ݺ� �˰����� ���� �����ϴ� �޼ҵ�
	public boolean add(int item) {
		Node newNode = new Node(item);
		Node p = root;

		while(true) {
			if(root == null) {
				root = newNode;
				return true;
			}
			if(item < p.key) {
				if(p.leftChild == null) {
					p.leftChild = newNode;
					return true;
				}
				else 
					p = p.leftChild;
			}		
			else if(item > p.key) {
				if(p.rightChild == null) {
					p.rightChild = newNode;
					return true;
				}
				else
					p = p.rightChild;
			}
			else
				return false;
		}
	}

	public boolean remove(int item) {
		Node p = root;
		Node parents = null; //�θ��� ���� 

		while (p != null) { //item�� Ž��
			if(p.key == item) //p.key�� item�� ��� while���� ��������
				break;
			else if (p.key > item) { // p�� item���� Ŭ ��
				parents = p;
				p = p.leftChild;
			}
			else {  // p�� item���� ���� ��
				parents = p;
				p = p.rightChild;
			}
		}

		if(p == null) //p�� item�� ã�� ������ ���, p�� ������� ���
			return false;

		else if (p.leftChild == null && p.rightChild == null) {// �ܸ������ ���
			if (p == root)             //p�� ��Ʈ�� ��
				root = null;
			else if (p == parents.leftChild) //p�� ���� �ڽ��� �� 
				parents.leftChild = null;
			else                             //p�� ������ �ڽ��� ��
				parents.rightChild = null;
		}

		else if (p.leftChild == null || p.rightChild == null) { //���� �ڽĸ� �ִ� ���
			if(p.rightChild != null) { // p�� �������ڽĸ� �ִ� ���
				if (p == root) // p�� ��Ʈ�� ��
					root = p.rightChild;
				else if (p == parents.leftChild) // p�� ���� �ڽ��� ��
					parents.leftChild = p.rightChild;
				else  // p�� ������ �ڽ��� ��
					parents.rightChild = p.rightChild;
			}
			else  {// p�� �����ڽĸ� �ִ� ���
				if (p == root) // p�� ��Ʈ�� ��
					root = p.leftChild;
				else if (p == parents.leftChild) //p�� ���� �ڽ��� ��
					parents.leftChild = p.leftChild;
				else //p�� ������ �ڽ��� ��
					parents.rightChild = p.leftChild;

			}
		}

		else { //���� �ڽ��� �ִ� ���
			Node q = p.leftChild; 
			while (q.rightChild != null) //p�� ��ü �� Ž��
				q = q.rightChild;
			remove(q.key);   //q����
			p.key = q.key; //p.key�� q�� key�� ��ü
		}
		return true;
	}
}

