import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//1¹ø
		System.out.println(num % 4==0 && num % 5==0);
		//2¹ø
		System.out.println(num % 4==0 || num % 5==0);
		//3¹ø
		System.out.println((num % 4==0 || num % 5==0) && (num % 4==0 && num % 5==0));
	}

}
