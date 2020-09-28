import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		Person[] people = {new Person(30, "ȫ�浿"), new Person(20, "��ö��"), new Person(25, "�迵��")};

		Person[] temp =  Arrays.stream(people)
				.sorted((p1, p2) -> {
					int r = p1.age - p2.age;
					if (r == 0) {
						r = p1.name.compareTo(p2.name);
					}
					return r;
				})
				.toArray(Person[]::new);
		// ���� ���� ����
		// {20, ��ö��}, {25, �迵��}, {30, ȫ�浿}���� ���ĵȴ�.
		
		// �̸� ���� ����
		// {25, �迵��}, {20, ��ö��}, {30, ȫ�浿}���� ���ĵȴ�.
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
