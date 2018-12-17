package e2018.exam2;

class World {
	String message = "æ»≥Á«œººø‰";
	class Hello {


		public void say() {
			System.out.println(message);
		}
	}
	
	public void doSomething() {
		Hello hello = new Hello();
		hello.say();
	}
}

public class Exam12 {	

	public static void main(String[] args) {
		World world = new World();
		world.doSomething();
	}
}
