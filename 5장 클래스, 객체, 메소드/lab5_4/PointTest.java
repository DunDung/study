/*
 * 파일명: PointTest.java
 * 작성일: 2018.4.5
 * 작성자: 홍준성
 * 내용:  점을 표현하는 Point 클래스 객체를 생성하고 이용하는 프로그램
 */
package lab5_4;

public class PointTest {
	public static void main(String[] args) {
		System.out.println("lab5_4: 홍준성");

		// (5) Point 객체 p1, p2를 생성
		Point p1 = new Point();
		Point p2 = new Point();

		// (6) p1은 5.5  만큼 이동, p2는 -1.0만큼 이동
		p1.move(5.5);
		p2.move(-1.0);
		p1.move();
		

		// p1, p2의 속성을 출력
		System.out.println(p1.toString()); // p1.toString() 대신 p1 라고 적어도 됨
		System.out.println(p2.toString()); // p2.toString() 대신 p2 라고 적어도 됨
		System.out.println("거리 = "+p2.distance(p1));
	}
}
