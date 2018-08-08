package lab15_1;

public class MyPairTest {
	public static void main(String[] args) {
		System.out.println("lab15_1: 홍준성");

		// 문자열을 주/종 원소로 갖는 MyPair 객체 pair를 생성
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");

		// 주 원소를 변수에 저장 후 출력
		String master = pair.getMaster();
		System.out.println(master + "팀");

		// pair를 출력
		System.out.println(pair);

		// pair의 주/종 원소를 교환
		pair.swap();

		// pair를 출력
		System.out.println(pair);
		
		// 학생(Student) 객체를 주/종 원소로 갖는 MyPair 객체 studentPair를 생성
		MyPair<Student> studentPair = new MyPair<Student>(new Student("kim"), new Student("park"));
		// studentPair를 출력
		System.out.println("\n"+studentPair);
		// studentPair의 주/종 원소를 교환
		studentPair.swap();
		// studentPair를 출력
		System.out.println(studentPair);

		// 정수(Integer) 객체를 주/종 원소로 갖는 MyPair 객체 integerPair를 생성
		MyPair<Integer> integerPair = new MyPair<Integer>(11, 22);
		// integerPair를 출력
		System.out.println("\n"+integerPair);
		// integerPair의 주/종 원소를 교환
		integerPair.swap();
		// integerPair를 출력
		System.out.println(integerPair);
	}
}


// String형 주/종 원소를 저장하는 클래스
class MyPair<T> {
	private T master; // 주 원소
	private T slave; // 종 원소

	public MyPair(T master, T slave) { // 생성자
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  주/종 원소를 교환하는 메소드
		T temp = master;
		master = slave;
		slave = temp;
	}

	public T getMaster() {
		return master;
	}

	public T getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "주=" + master + " 종=" + slave;
	}
}


class Student {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}
