package lab7_1;

public class Manager extends Employee { //직원 클래스를 상속
	private int bonus;
	
	public Manager(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setBouns(int bonus) {
		this.bonus = bonus;
	}
	@Override //어노테이션
	public int getTax() {
		return (getSalary()+bonus) / 10;
	}
}
