/*
 * 파일명: TelevisionTest.java
 * 작성일: 2018.3.29
 * 작성자: 홍준성
 * 내용: 텔레비전을 나타내는 Television 클래스를 정의하고, Television 배열을 이용하는 프로그램  
 */
package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("lab5_2: 홍준성\n");
		Television t[] = new Television[3];
		t[0] = new Television();
		t[1] = new Television();
		t[2] = new Television();
		
		t[0].channel = 7;
		t[1].channel = 9;
		t[2].channel = 11;
		
		for(int i=0; i<3; i++)
			System.out.print(t[i].channel+" ");

	}

}
