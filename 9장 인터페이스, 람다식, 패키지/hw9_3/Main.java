/*
 * ���ϸ�: Main.java
 * �ۼ���: 2018.5.31
 * �ۼ���: ȫ�ؼ�
 */
package hw9_3;

class Student {
	int age;
	int score;
}

@FunctionalInterface
interface Tester {
	boolean test(Student s);
}

public class Main {
	public static void check(Student s, Tester t) {
		boolean result = t.test(s);
		System.out.println(result);
	}

	public static void main(String... args) {
		System.out.println("hw9_3: ȫ�ؼ�");

		Student kim = new Student();
		kim.age = 19;
		kim.score = 80;

		
		check(kim, s -> s.score >= 60); //PassTester�� ���ְ� ���ٽ��� ���

		check(kim, s -> s.age >= 20); //AdultTester�� ���ְ� ���ٽ��� ���
	}
}
