/*
 * 파일명: TestPair.java
 * 작성자: 홍준성
 * 작성일: 2017년 10월 31일
 * 내용: 스택을 이용하여 괄호를 검사하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
import java.util.Stack;

public class TestPair {

	public static void main(String[] args) {
		System.out.println("hw7_1: 홍준성\n");

		Stack<Character> s = new Stack<Character>(); //java.util.Stack 클래스를 이용
		Scanner scan = new Scanner(System.in);

		System.out.print("괄호식 입력: ");
		String symbol = scan.nextLine();
		int len;
		boolean a = false;
		
		for(len = 0; len < symbol.length(); len++) { //String에있는 괄호식을 char로 바꾼 후 검사
			char ch = symbol.charAt(len);
			a = true;
			
			switch(ch) {
			case '(': case '[': case '{': case'<': //여는괄호면 push
				s.push(ch);
				break;
			case ')': //닫는 괄호들은 짝이맞는지 검사 후 pop
				if(s.isEmpty() || s.peek() != '(') { //스택이 비어있거나 짝이안맞는경우엔 false
					a = false;
					break;
				}
				else {
					s.pop();                            
					break;
				}
			case ']':
				if(s.isEmpty() || s.peek() != '[') {
					a = false;
					break;
				}
				else {
					s.pop();
					break;
				}
			case '}':
				if(s.isEmpty() || s.peek() != '{') {
					a = false;
					break;
				}
				else {
					s.pop();
					break;
				}
			case '>':
				if(s.isEmpty() || s.peek() != '<') {
					a = false;
					break;
				}
				else {
					s.pop();
					break;
				}
			default :
				a = false;
				break;
			}
			if(a == false) //a에 false가 삽입된 경우 for문을 종료 
				break;
		}
		if(s.isEmpty() && symbol.length() == len && a== true ) //스택이 비어있고 검사를 실행한 횟수가 괄호식의 길이와  일치하는 경우
			System.out.print("올바른 괄호식입니다.");
		else
			System.out.print("올바른 괄호식이 아닙니다.");
		
	}
}

