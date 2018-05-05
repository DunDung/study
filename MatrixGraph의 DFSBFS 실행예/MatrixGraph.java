package hw10_2;

import java.util.*; 

public class MatrixGraph {
	private int [][] matrix; //�׷����� ǥ���� 2���� �迭
	private int n; //�迭�� ũ�⸦ ���� ����
	private boolean [] visited; //Ž���� ���� boolean�� �迭


	public MatrixGraph(int n) { //���� ������ n�� �׷��� ����
		matrix = new int[n][n]; //n x n ��� ��ü ����
		this.n = n;
		visited = new  boolean[n]; //boolean�� �迭 ��ü ����
	}

	public void addEdge(int v1, int v2) {
		if(v1<0 || v1>n-1 || v2<0 || v2>n-1)
			System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
		else if(matrix[v1][v2] == 1)
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		else {
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
	}

	public void printAdjacentVertices(int v) {
		if(v<0 || v>n-1)
			System.out.println("���� ���� ��� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else{
			System.out.print(v + "�� ������ ���� = ");
			for(int i=0; i<n; i++) {
				if(matrix[v][i] == 1)
					System.out.print(i+" ");
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
		for(int i = 0; i<n; i++) {
			if(matrix[v][i] == 1 && visited[i] == false) {
				System.out.print(i+" ");
				DFS(i); //��������� DFS�Լ� ȣ��
			}
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
		visited[v] = true;
		Queue<Integer> q = new <Integer> LinkedList(); // �ڹ� API�� Ŭ������ �̿��� ť ����
		q.offer(v); //v�� enQueue

		while(!q.isEmpty()) {
			int temp = q.remove(); //ť���� remove�� ���� temp�� ����
			System.out.print(temp+ " "); //temp�� ���

			for(int i=0; i<n; i++) {
				if(matrix[temp][i] == 1 && visited[i] == false) {
					q.offer(i); //ť���� i�� enQueue
					visited[i] = true;
				}
			}
		}
	}
}