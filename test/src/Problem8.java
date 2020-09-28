import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		String s = scan.next(); //문자열로 입력받는다.

		int sum = 0;
		//한글자씩 때어서 숫자로 바꾸고 sum에 저장한다.
		for(int i=0; i<s.length(); i++)
			sum += Integer.parseInt(s.substring(i, i+1));
		
		System.out.println("각 자릿수의 합  = "+sum);
		
	}

}
