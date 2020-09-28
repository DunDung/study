import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		Person[] people = {new Person(30, "È«±æµ¿"), new Person(20, "±èÃ¶¼ö"), new Person(25, "±è¿µÈñ")};

		Person[] temp =  Arrays.stream(people)
				.sorted((p1, p2) -> {
					int r = p1.age - p2.age;
					if (r == 0) {
						r = p1.name.compareTo(p2.name);
					}
					return r;
				})
				.toArray(Person[]::new);
		// ³ªÀÌ ±âÁØ Á¤·Ä
		// {20, ±èÃ¶¼ö}, {25, ±è¿µÈñ}, {30, È«±æµ¿}À¸·Î Á¤·ÄµÈ´Ù.
		
		// ÀÌ¸§ ±âÁØ Á¤·Ä
		// {25, ±è¿µÈñ}, {20, ±èÃ¶¼ö}, {30, È«±æµ¿}À¸·Î Á¤·ÄµÈ´Ù.
	}
}
class Person {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
