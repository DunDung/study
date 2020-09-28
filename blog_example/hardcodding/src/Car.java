public class Car {
	private final String name;
	private final int speed;
	private int position;

	public Car(String name, int position, int speed) {
		this.name = name;
		this.position = position;
		this.speed = speed;
	}

	public void move(int randomNumber) {
		if (randomNumber > 4) {
			position++;
		}
	}

}
