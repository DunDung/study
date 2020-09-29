package blog_example.immutable;

public class Car {
	private final String name;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car{" +
			"name='" + name + '\'' +
			'}';
	}
}
