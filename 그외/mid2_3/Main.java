/*
 * 파일명: Main.java
 * 작성일: 2018.5.4
 * 작성자: 홍준성
 * 내용: 원을 다루는 프로그램
 */
package mid2_3;

public class Main {

	public static void main(String[] args) {  
		System.out.println("mid2_3: 홍준성");
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5, new Point(10, 20));
		Circle c3 = new Circle(3.5, new Point(10, 20));

		System.out.println(c2.sameCenter(c1));    // false
		System.out.println(c2.sameCenter(c3));    // true

		printCircle(c2);
	}

	// (1) 매개변수로 받은 원 c의 반지름, 중심의 x, y좌표를
	//     출력하는 메소드
	private static void printCircle(Circle c) {
		System.out.println(c.getRadius());
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
	}
}
