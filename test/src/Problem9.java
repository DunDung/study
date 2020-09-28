import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int 전공 = scan.nextInt();
		System.out.print("교양 이수 학점 : ");
		int 교양 = scan.nextInt();
		System.out.print("일반 이수 학점 : ");
		int 일반 = scan.nextInt();
		
		if(전공+교양+일반 >= 140) {
			if(교양>=30 && 일반 >= 30 || 교양+일반>=80)
				System.out.println("졸업 가능");
			else
				System.out.println("졸업 불가");
		}
		else
			System.out.println("졸업 불가");
			
	}
}
