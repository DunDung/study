/*
 * ���ϸ�: SingerTest.java
 * �ۼ���: 2018.5.24
 * �ۼ���: ȫ�ؼ�
 */
package hw9_2;

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
		System.out.println("hw9_2: ȫ�ؼ�");

		Student kim = new Student();
		kim.age = 19;
		kim.score = 80;



		check(kim, new Tester() { //PassTester Ŭ������ ���ְ� ����Ŭ������ ���
			@Override
			public boolean test(Student s) {
				return s.score >= 60;
			}
		});

		check(kim, new Tester() { //AdultTester Ŭ������ ���ְ� ����Ŭ������ ��� 
			@Override
			public boolean test(Student s) {
				return s.age >= 20;
			}   
		});
	}
}
