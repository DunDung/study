package lab15_1;

public class MyPairTest {
	public static void main(String[] args) {
		System.out.println("lab15_1: ȫ�ؼ�");

		// ���ڿ��� ��/�� ���ҷ� ���� MyPair ��ü pair�� ����
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");

		// �� ���Ҹ� ������ ���� �� ���
		String master = pair.getMaster();
		System.out.println(master + "��");

		// pair�� ���
		System.out.println(pair);

		// pair�� ��/�� ���Ҹ� ��ȯ
		pair.swap();

		// pair�� ���
		System.out.println(pair);
		
		// �л�(Student) ��ü�� ��/�� ���ҷ� ���� MyPair ��ü studentPair�� ����
		MyPair<Student> studentPair = new MyPair<Student>(new Student("kim"), new Student("park"));
		// studentPair�� ���
		System.out.println("\n"+studentPair);
		// studentPair�� ��/�� ���Ҹ� ��ȯ
		studentPair.swap();
		// studentPair�� ���
		System.out.println(studentPair);

		// ����(Integer) ��ü�� ��/�� ���ҷ� ���� MyPair ��ü integerPair�� ����
		MyPair<Integer> integerPair = new MyPair<Integer>(11, 22);
		// integerPair�� ���
		System.out.println("\n"+integerPair);
		// integerPair�� ��/�� ���Ҹ� ��ȯ
		integerPair.swap();
		// integerPair�� ���
		System.out.println(integerPair);
	}
}


// String�� ��/�� ���Ҹ� �����ϴ� Ŭ����
class MyPair<T> {
	private T master; // �� ����
	private T slave; // �� ����

	public MyPair(T master, T slave) { // ������
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  ��/�� ���Ҹ� ��ȯ�ϴ� �޼ҵ�
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
		return "��=" + master + " ��=" + slave;
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
