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

	private class Node {
		int vertex;
		Node link;
	}
}
