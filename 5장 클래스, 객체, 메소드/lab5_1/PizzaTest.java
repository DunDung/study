/*
 * 파일명: PizzaTest.java
 * 작성일: 2018.3.29
 * 작성자: 홍준성
 * 내용: 피자를 나타내는 Pizza 클래스를 정의하고 이를 이용하는 프로그램.  
 */
package lab5_1;

public class PizzaTest {

	public static void main(String[] args) {
		System.out.println("lab5_1: 홍준성\n");
		Pizza p = new Pizza();
		p.brand = "PizzaSchool";
		p.dia = 25.5;
		p.price = 50000;
		
		System.out.print("브랜드는 "+p.brand+"이며 지름은 "+p.dia+"cm 가격은 "+p.price+"원인 비싸고 맛있는피자");

	}

}
