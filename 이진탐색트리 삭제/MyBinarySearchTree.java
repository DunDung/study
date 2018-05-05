/* 
 * 파일명: MyBinarySearchTree.java
 * 작성일: 2017.11.28
 * 작성자: 홍준성
 * 설명: int형 키값 저장하는 이진탐색트리를 연결자료구조로 구현한 클래스
 */
package hw9_2;


import java.util.NoSuchElementException;

class MyBinarySearchTree {
	// 트리의 루트 노드를 가리킬 인스턴스 변수 root 선언하고 null로 초기화
	private Node root = null;



	// 트리의 노드를 표현하는 클래스 - 필드(int형 key, leftChild, rightChild), 생성자(key값을 매개변수하여 초기화)
	private class Node {
		int key;
		Node leftChild;
		Node rightChild;

		Node(int key) {
			this.key = key;
		}
	}

	// (1) 전체조회를 위한 toString() 오버라이드
	@Override
	public String toString() {
		String result = inorder(root);
		return result;
	}

	// p를 루트로 하는 트리를 중위 순회하며 키값을 문자열로 리턴하는 메소드(재귀 알고리즘)
	private String inorder(Node p) {
		String result = "";
		if(p != null) {
			result += inorder(p.leftChild);
			result += p.key + " ";
			result += inorder(p.rightChild);
		}
		return result;
	}

	// (2) 재귀 삽입
	public void insert(int key) {  
		root = insertKey(root, key);
	}

	// p를 루트로 하는 트리에 key를 삽입하는 메소드 (재귀 알고리즘)
	private Node insertKey(Node p, int key) {
		if(p == null) {		
			Node newNode = new Node(key);
			return newNode;	
		}
		else if(key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p;		// 루트 불변
		}
		else if(key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p;		// 루트 불변        
		}
		else {  // key = p.key 인 경우 삽입 실패
			System.out.println("Insertion fail! key duplication : " + key);
			return p;  	// 루트 불변
		}
	}   

	// (3) 후위 순회
	public void printPostorder() {
		postorder(root);
		System.out.println();
	}

	// p를 루트로 하는 트리를 후위 순회하며 키값을 출력하는 메소드
	private void postorder(Node p) {

		if(p!=null) {
			postorder(p.leftChild);
			postorder(p.rightChild);
			System.out.print(p.key+" ");
		}
	}
	// p를 루트로 하는 트리를 돌아다니며 item을 검색해주는 메소드
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
	// p를 루트로 하는 트리에 최대값을 리턴하는 메소드
	public int max() {
		Node p = root;
		if(p == null)
			throw new NoSuchElementException("트리가 비어있습니다.");
		else {
			while(p.rightChild != null) 
				p = p.rightChild;
			return p.key;
		}
	}
	//p를 루트로하는 트리를 반복 알고리즘을 통해 삽입하는 메소드
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
		Node parents = null; //부모노드 생성 

		while (p != null) { //item을 탐색
			if(p.key == item) //p.key가 item일 경우 while문을 빠져나옴
				break;
			else if (p.key > item) { // p가 item보다 클 때
				parents = p;
				p = p.leftChild;
			}
			else {  // p가 item보다 작을 때
				parents = p;
				p = p.rightChild;
			}
		}

		if(p == null) //p가 item을 찾지 못했을 경우, p가 비어있을 경우
			return false;

		else if (p.leftChild == null && p.rightChild == null) {// 단말노드일 경우
			if (p == root)             //p가 루트일 때
				root = null;
			else if (p == parents.leftChild) //p가 왼쪽 자식일 때 
				parents.leftChild = null;
			else                             //p가 오른쪽 자식일 때
				parents.rightChild = null;
		}

		else if (p.leftChild == null || p.rightChild == null) { //한쪽 자식만 있는 경우
			if(p.rightChild != null) { // p가 오른쪽자식만 있는 경우
				if (p == root) // p가 루트일 때
					root = p.rightChild;
				else if (p == parents.leftChild) // p가 왼쪽 자식일 때
					parents.leftChild = p.rightChild;
				else  // p가 오른쪽 자식일 때
					parents.rightChild = p.rightChild;
			}
			else  {// p가 왼쪽자식만 있는 경우
				if (p == root) // p가 루트일 때
					root = p.leftChild;
				else if (p == parents.leftChild) //p가 왼쪽 자식일 때
					parents.leftChild = p.leftChild;
				else //p가 오른쪽 자식일 때
					parents.rightChild = p.leftChild;

			}
		}

		else { //양쪽 자식이 있는 경우
			Node q = p.leftChild; 
			while (q.rightChild != null) //p의 대체 값 탐색
				q = q.rightChild;
			remove(q.key);   //q삭제
			p.key = q.key; //p.key를 q의 key로 대체
		}
		return true;
	}
}

