/*
 * ���ϸ�: TestPair.java
 * �ۼ���: ȫ�ؼ�
 * �ۼ���: 2017�� 10�� 31��
 * ����: ������ �̿��Ͽ� ��ȣ�� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner;
import java.util.Stack;

public class TestPair {

	public static void main(String[] args) {
		System.out.println("hw7_1: ȫ�ؼ�\n");

		Stack<Character> s = new Stack<Character>(); //java.util.Stack Ŭ������ �̿�
		Scanner scan = new Scanner(System.in);

		System.out.print("��ȣ�� �Է�: ");
		String symbol = scan.nextLine();
		int len;
		boolean a = false;
		
		for(len = 0; len < symbol.length(); len++) { //String���ִ� ��ȣ���� char�� �ٲ� �� �˻�
			char ch = symbol.charAt(len);
			a = true;
			
			switch(ch) {
			case '(': case '[': case '{': case'<': //���°�ȣ�� push
				s.push(ch);
				break;
			case ')': //�ݴ� ��ȣ���� ¦�̸´��� �˻� �� pop
				if(s.isEmpty() || s.peek() != '(') { //������ ����ְų� ¦�̾ȸ´°�쿣 false
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
			if(a == false) //a�� false�� ���Ե� ��� for���� ���� 
				break;
		}
		if(s.isEmpty() && symbol.length() == len && a== true ) //������ ����ְ� �˻縦 ������ Ƚ���� ��ȣ���� ���̿�  ��ġ�ϴ� ���
			System.out.print("�ùٸ� ��ȣ���Դϴ�.");
		else
			System.out.print("�ùٸ� ��ȣ���� �ƴմϴ�.");
		
	}
}

