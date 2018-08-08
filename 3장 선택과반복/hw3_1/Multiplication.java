/*
 * 파일명: Multiplication.java
 * 작성일: 2018.3.20
 * 작성자: 홍준성
 * 내용: 저금통에 있는 달러를 한화로 환전하는 프로그램  
 */
package hw3_1;
import java.util.Random;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("hw3_1:홍준성\n");
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		//필요한 변수들 선언
		int ans;
		int o = 0;
		int x = 0;
		int score = 0;
		
		System.out.println("곱셈 문제의 답을 입력하세요(통과하려면 0을 입력)\n");
		for(int i = 0; i<5; i++) {
			int n1 = generator.nextInt(9)+1;
			int n2 = generator.nextInt(9)+1;
			System.out.print(n1+" * "+n2+" = ? ");
			ans = scan.nextInt();
			//정답일경우
			if(ans == n1*n2) {
				System.out.println("정답입니다.");
				o++;
				score+=20;
			}//0을 입력할 경우
			else if(ans == 0)
				System.out.println("통과");
			else {//틀렸을경우
				System.out.println("틀렸습니다.");
				x++;
				if(score > 0)
					score -=10;
			}
			System.out.println("");
		}
		if(score < 0)
			score = 0;
		
		System.out.print("정답수"+o+" 오답수"+x+" 총점"+score+" --> ");
		if(score >= 50)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}

