/*
 * ���ϸ�: Count.java
 * �ۼ���: 2018.6.12
 * �ۼ���: ȫ�ؼ�
 */
package hw15_2;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		System.out.println("hw15_2: ȫ�ؼ�\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ���.");
		String sentence = scan.nextLine(); //String�� �� ���� ������ ����

		char [] a = new char[sentence.length()]; //������ ���� char�� �迭�� ������ ���̸�ŭ ����
		Map<Character, Integer> m = new HashMap<Character, Integer>(); //Map����

		for(int i = 0; i<a.length; i++) {
			a[i] = sentence.charAt(i); //String ������ �ѱ��ھ� char�� �迭�� ����
			if(m.containsKey(a[i])== false) //�ʿ� �������� �ʴ� ���ڶ��
				m.put(a[i], new Integer(1)); //�ʿ� �󵵼� 1�� ����
			else
				m.replace(a[i], m.get(a[i]), m.get(a[i])+1); //�ʿ� �̹� �ִ� ���ڶ��  �󵵼��� 1 �÷��ش�.
		}

		System.out.println(m); //���

	}
}
