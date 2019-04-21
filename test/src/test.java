import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[3];
		int [] b = new int[2];

		for(int i=0; i<3; i++)
			a[i] = scan.nextInt();
		for(int i=0; i<2; i++)
			b[i] = scan.nextInt();

		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a[0]+b[0]-50);
	}
}




