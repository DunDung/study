package hw10_2;

import java.util.*; 

public class MatrixGraph {
	private int [][] matrix; //그래프를 표현할 2차원 배열
	private int n; //배열의 크기를 위한 변수
	private boolean [] visited; //탐색을 위한 boolean형 배열


	public MatrixGraph(int n) { //정점 갯수가 n인 그래프 생성
		matrix = new int[n][n]; //n x n 행렬 객체 생성
		this.n = n;
		visited = new  boolean[n]; //boolean형 배열 객체 생성
	}

	public void addEdge(int v1, int v2) {
		if(v1<0 || v1>n-1 || v2<0 || v2>n-1)
			System.out.println("잘못된 정점 번호입니다.");
		else if(matrix[v1][v2] == 1)
			System.out.println("이미 존재하는 간선입니다.");
		else {
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
	}

	public void printAdjacentVertices(int v) {
		if(v<0 || v>n-1)
			System.out.println("인접 정점 출력 오류 - 잘못된 정점 번호입니다.");
		else{
			System.out.print(v + "에 인접한 정점 = ");
			for(int i=0; i<n; i++) {
				if(matrix[v][i] == 1)
					System.out.print(i+" ");
			}		
		}
	}

	public void depthFirstSearch() { //깊이 우선 탐색
		for(int i=0; i<n; i++) 
			visited[i] = false;
		for(int j=0; j<n; j++) {
			if(visited[j] == false) {
				System.out.print(j + " ");
				DFS(j);
			}
		}
	}

	private void DFS(int v) { //깊이 우선 탐색
		visited[v] = true;
		for(int i = 0; i<n; i++) {
			if(matrix[v][i] == 1 && visited[i] == false) {
				System.out.print(i+" ");
				DFS(i); //재귀적으로 DFS함수 호출
			}
		}
	}

	public void breadthFirstSearch() { //넓이 우선 탐색
		for(int i=0; i<n; i++) 
			visited[i] = false;
		for(int i=0; i<n; i++) {
			if(visited[i] == false)
				BFS(i);
		}
	}
	private void BFS(int v) {
		visited[v] = true;
		Queue<Integer> q = new <Integer> LinkedList(); // 자바 API의 클래스를 이용한 큐 생성
		q.offer(v); //v를 enQueue

		while(!q.isEmpty()) {
			int temp = q.remove(); //큐에서 remove한 값을 temp에 저장
			System.out.print(temp+ " "); //temp값 출력

			for(int i=0; i<n; i++) {
				if(matrix[temp][i] == 1 && visited[i] == false) {
					q.offer(i); //큐에서 i를 enQueue
					visited[i] = true;
				}
			}
		}
	}
}