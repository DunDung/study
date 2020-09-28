package lab7_4;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab7_4: È«ÁØ¼º");
		
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(2);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}
}
