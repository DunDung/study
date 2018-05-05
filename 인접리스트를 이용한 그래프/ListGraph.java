package hw10_1;

public class ListGraph {
	private Node[] list;
	private int n;

	public ListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}


	public void addEdge(int v1, int v2) {
		if(v1<0 || v1>n-1 || v2<0 || v2>n-1)
			System.out.println("잘못된 정점 번호입니다."); 

		else {
			Node tmp = list[v1];
			while(tmp != null) { // 이미 존재하는 간선인지 탐색
				if(tmp.vertex == v2) {
					System.out.println("이미 존재하는 간선입니다.");
					break;
				}
				tmp = tmp.link;
			}

			if(tmp == null) { //탐색이 안돼서 tmp가 null이 됐을 경우
				if(v1==v2) { //v1과 v2 같을 경우  한번만 간선을 삽입
					Node newNode1 = new Node();
					newNode1.vertex = v2;
					newNode1.link = list[v1];
					list[v1] = newNode1;
				}
				else { // 다를 경우 양쪽에 간선을 삽입
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

	public void printAdjacentVertices(int v) { //list[v]에 있는 정점들을 출력하는 메소드
		if(v<0 || v>n-1)
			System.out.println("인접 정점 출력 오류 - 잘못된 정점 번호입니다.");
		else {
			Node tmp = list[v];
			System.out.print(v + "에 인접한 정점 = ");
			while(tmp != null) {
				System.out.print(tmp.vertex+" ");
				tmp = tmp.link;
			}
		}
	}

	private class Node {
		int vertex;
		Node link;
	}
}
