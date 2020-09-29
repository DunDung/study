package lab10_1;

public class MatrixGraph {
	private int [][] matrix;
	private int n;

	public MatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
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
}
