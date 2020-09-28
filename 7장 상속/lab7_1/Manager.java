package lab7_1;

public class Manager extends Employee { //���� Ŭ������ ���
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
	@Override //������̼�
	public int getTax() {
		return (getSalary()+bonus) / 10;
	}
}
