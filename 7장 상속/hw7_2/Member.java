package hw7_2;

public abstract class Member {
	private int age;
	
	public Member(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract int getPayment();
}
