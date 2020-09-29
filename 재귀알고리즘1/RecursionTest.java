
public class RecursionTest {

	public static void main(String[] args) {
		System.out.println("lab0_8 : È«ÁØ¼º");

		g(4);
		System.out.println();
		System.out.println(sum(4));
	}

	private static void g(int n) {
		if(n > 0) {
			System.out.print(n + " ");
			g(n-1);
		}
	}
	private static int sum(int n) {
		if(n == 1) 
			return 1;
		else
			return n + sum(n-1);
	}
}
