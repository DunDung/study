
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {

	static void solution(int[] a) {
		// �迭 a���� 2�� ����� 3�� ����� ��� �����ϰ�
		// ���ŵ� �׸��� �� �׸���� ������ ��ܾ� �Ѵ�.
		// ���ŵ� �׸� ������ ���� �迭 ���� ������ -1�� ä����

		//		int end = a.length-1;
		//		for(int i=0; i<a.length; i++) {
		//			if(a[i] % 2 ==0 || a[i] %3 ==0) {
		//				for(int j = i; j<a.length-1; j++) {
		//					a[j] = a[j+1];
		//				}
		//				a[end] = -1;
		//				end--;
		//				i--;
		//			}
		//		}
		int index = 0;
		for (int i = 0; i < a.length && a[i] > 0; ++i)
			if ((a[i] % 2) != 0 && (a[i] % 3) != 0)
				a[index++] = a[i];
		for (int i = index; i < a.length; ++i)
			a[i] = -1;
	}


	public static void main(String[] args) {
		int[] a = new int[] {1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7};
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}

