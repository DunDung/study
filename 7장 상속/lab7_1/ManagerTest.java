/*
 * ���ϸ�: ManageTest.java
 * �ۼ���: 2018.5.8
 * �ۼ���: ȫ�ؼ�
 * ����: ����(Employee) Ŭ������ ����ϴ� �Ŵ���(Manager) Ŭ������ �����ϰ� ����ϴ� ���α׷�  
 */
package lab7_1;

public class ManagerTest {

	public static void main(String[] args) {
		System.out.println("lab7_1: ȫ�ؼ�\n");

		Employee e = new Employee(1000);
		System.out.println("����");
		System.out.println("slalary = "+e.getSalary());
		System.out.println("tax = "+e.getTax());

		Manager m = new Manager(1000, 500);
		
		System.out.println("\n�Ŵ���");
		System.out.println("salary = "+m.getSalary());
		System.out.println("bonus = "+m.getBonus());
		System.out.println("tax = "+m.getTax());
	}
}
