
/*
 * 파일명: Point.java
 * 작성일: 2018.4.5
 * 작성자: 홍준성
 * 내용:  x 좌표를 갖는 1차원 점을 표현하는 Point 클래스를 정의
 */
package lab5_4;

public class Point {
	// (1) 필드: double형 x 좌표
	double x;
	// (2) move() 메소드 : double형 매개변수를 그 값만큼 x 좌표를 이동
	public void move(double n) {
		x+=n;
	}
	
	public void move() {
		x++;
	}
	public double distance(Point p) {
		return Math.abs(x - p.x);
	}

	// toString() 메소드: Point의 속성을 문자열로 만들어 리턴 - @Override, public은 6, 7장에서 배움
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}
}
