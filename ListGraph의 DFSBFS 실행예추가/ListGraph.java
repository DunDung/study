package hw10_3;

import java.util.LinkedList;
import java.util.Queue;

public class ListGraph {
	private Node[] list;
	private int n;
	private boolean [] visited; //Ž���� ���� boolean�� �迭

	public ListGraph(int n) {
		list = new Node[n];
		this.n = n;
		visited = new  boolean[n]; //boolean�� �迭 ��ü ����
	}


	public void addEdge(int v1, int v2) {
		if(v1<0 || v1>n-1 || v2<0 || v2>n-1)
			System.out.println("�߸��� ���� ��ȣ�Դϴ�."); 

		else {
			Node tmp = list[v1];
			while(tmp != null) { // �̹� �����ϴ� �������� Ž��
				if(tmp.vertex == v2) {
					System.out.println("�̹� �����ϴ� �����Դϴ�.");
					break;
				}
				tmp = tmp.link;
			}

			if(tmp == null) { //Ž���� �ȵż� tmp�� null�� ���� ���
				if(v1==v2) { //v1�� v2 ���� ���  �ѹ��� ������ ����
					Node newNode1 = new Node();
					newNode1.vertex = v2;
					newNode1.link = list[v1];
					list[v1] = newNode1;
				}
				else { // �ٸ� ��� ���ʿ� ������ ����
					Node newNode1 = new Node();
					newNode1.vertex = v2;
					newNode1.link = list[v1];
					list[v1] = newNode1;
					Node newNode2 = new Node();
					newNode2.vertex = v1;
					newNode2.link = list[v2];
					list[v2] = newNode2;
				}
			}
		}
	}

	public void printAdjacentVertices(int v) { //list[v]�� �ִ� �������� ����ϴ� �޼ҵ�
		if(v<0 || v>n-1)
			System.out.println("���� ���� ��� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else {
			Node tmp = list[v];
			System.out.print(v + "�� ������ ���� = ");
			while(tmp != null) {
				System.out.print(tmp.vertex+" ");
				tmp = tmp.link;
			}
		}
	}

	public void depthFirstSearch() { //���� �켱 Ž��
		for(int i=0; i<n; i++) 
			visited[i] = false;
		for(int j=0; j<n; j++) {
			if(visited[j] == false) {
				System.out.print(j + " ");
				DFS(j);
			}
		}
	}

	private void DFS(int v) { //���� �켱 Ž��
		visited[v] = true;
		Node tmp = list[v]; //tmp�� list[v]�� �ʱ�ȭ
		while(tmp != null) { //tmp�� null�� �ƴҶ� 
			if(visited[tmp.vertex] == false) {
				System.out.print(tmp.vertex+" ");
				DFS(tmp.vertex);
			}
			else
				tmp = tmp.link;
		}
	}


	public void breadthFirstSearch() { //���� �켱 Ž��
		for(int i=0; i<n; i++) 
			visited[i] = false;
		for(int i=0; i<n; i++) {
			if(visited[i] == false)
				BFS(i);
		}
	}
	private void BFS(int v) {

		visited[v] = false;
		Queue<Integer> q = new <Integer> LinkedList(); // �ڹ� API�� Ŭ������ �̿��� ť ����
		q.offer(v); //v�� enQueue

		while(!q.isEmpty()) {
			int temp = q.remove(); //ť���� remove�� ���� temp�� ����
			System.out.print(temp+ " "); //temp�� ���

			if(list[v] != null) {
				while(visited[list[v].vertex] == false) { //visited���� false�� ��
					visited[list[v].vertex] = true; 
					q.offer(list[v].vertex); //ť�� list[v].vertex���� enQueue
				}					
			}
		}
	}

	private class Node {
		int vertex;
		Node link;
	}
}
