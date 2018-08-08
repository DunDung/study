package hw7_2;

public class HourlyMember extends Member {
	private int useTime;
	
	public HourlyMember(int age, int useTime) {
		super(age);
		this.useTime = useTime;
	}
	
	@Override
	public int getPayment() {
		return 100 * useTime;
	}
}
