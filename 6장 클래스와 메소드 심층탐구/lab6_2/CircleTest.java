/*
 * 파일명: CircleTest.java
 * 작성일: 2018.4.12
 * 작성자: 홍준성
 * 내용: 원 프로그램 작성
 */
package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab6_2: 홍준성");

		Circle c1 = new Circle(); // (1) 원 생성(c1)
		Circle c2 = new Circle(2.5); //(2) 반지름이 2.5인 원 생성(c2)
		System.out.println("c1의 반지름: "+c1.getRadius());//(3) c1, c2의 반지름을 조회하여 출력
		System.out.println("c2의 반지름: "+c2.getRadius());
		
		System.out.println("c1의 면적: "+c1.area()); //(4) c1, c2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("c2의 면적: "+c2.area());
		
		c1.setRadius(c2.getRadius()); // (5) c1의 반지름을 c2의 반지름 값으로 지정
		
		System.out.println("c1의 반지름: "+c1.getRadius());// (6) c1, c2의 반지름을 조회하여 출력
		System.out.println("c2의 반지름: "+c2.getRadius());
		
		System.out.println("c1의 면적: "+c1.area()); //(7) c1, c2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("c2의 면적: "+c2.area());
		
		c2.setRadius(1.5); //(8) c2의 반지름을 1.5로 지정
		
		System.out.println("c1의 면적: "+c1.area()); //(9) c1, c2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("c2의 면적: "+c2.area());
		
	}

}
