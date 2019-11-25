import java.util.*;

public class test {
	static int a,b,c;
	public static void main(String[] args) {
		int[][] a = {{1,1}, {1,1}};
		int [][] b = new int[2][2];
		int cnt = 0;
		for(int [] v : a) {

			b[cnt++] = v.clone();
		}
		System.out.println(Arrays.deepToString(a));
		b[0][0] = 0;
		System.out.println(Arrays.deepToString(a));

		System.out.println(Arrays.deepToString(b));
	}
	static void prnt() {
		while(a < b) {
			System.out.println(a);
			++a;
			c= c+a;
			prnt();
		}
	}

}
