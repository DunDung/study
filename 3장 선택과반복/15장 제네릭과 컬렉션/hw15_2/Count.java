/*
 * 파일명: Count.java
 * 작성일: 2018.6.12
 * 작성자: 홍준성
 */
package hw15_2;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		System.out.println("hw15_2: 홍준성\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("한 줄의 문장을 입력하세요.");
		String sentence = scan.nextLine(); //String에 한 줄의 문장을 저장

		char [] a = new char[sentence.length()]; //문장을 담을 char형 배열을 문장의 길이만큼 생성
		Map<Character, Integer> m = new HashMap<Character, Integer>(); //Map생성

		for(int i = 0; i<a.length; i++) {
			a[i] = sentence.charAt(i); //String 문장을 한글자씩 char형 배열에 저장
			if(m.containsKey(a[i])== false) //맵에 존재하지 않는 문자라면
				m.put(a[i], new Integer(1)); //맵에 빈도수 1로 저장
			else
				m.replace(a[i], m.get(a[i]), m.get(a[i])+1); //맵에 이미 있는 문자라면  빈도수를 1 늘려준다.
		}

		System.out.println(m); //출력

	}
}
