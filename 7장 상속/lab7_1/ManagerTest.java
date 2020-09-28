/*
 * 파일명: ManageTest.java
 * 작성일: 2018.5.8
 * 작성자: 홍준성
 * 내용: 직원(Employee) 클래스를 상속하는 매니저(Manager) 클래스를 정의하고 사용하는 프로그램  
 */
package lab7_1;

public class ManagerTest {

	public static void main(String[] args) {
		System.out.println("lab7_1: 홍준성\n");

		Employee e = new Employee(1000);
		System.out.println("직원");
		System.out.println("slalary = "+e.getSalary());
		System.out.println("tax = "+e.getTax());

		Manager m = new Manager(1000, 500);
		
		System.out.println("\n매니저");
		System.out.println("salary = "+m.getSalary());
		System.out.println("bonus = "+m.getBonus());
		System.out.println("tax = "+m.getTax());
	}
}
