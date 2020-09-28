/*
 * 파일명: SingerTest.java
 * 작성일: 2018.5.24
 * 작성자: 홍준성
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
		System.out.println("hw9_2: 홍준성");

		Student kim = new Student();
		kim.age = 19;
		kim.score = 80;



		check(kim, new Tester() { //PassTester 클래스를 없애고 무명클래스를 사용
			@Override
			public boolean test(Student s) {
				return s.score >= 60;
			}
		});

		check(kim, new Tester() { //AdultTester 클래스를 없애고 무명클래스를 사용 
			@Override
			public boolean test(Student s) {
				return s.age >= 20;
			}   
		});
	}
}
