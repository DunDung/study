/*
 * ���ϸ�: PizzaTest.java
 * �ۼ���: 2018.3.29
 * �ۼ���: ȫ�ؼ�
 * ����: ���ڸ� ��Ÿ���� Pizza Ŭ������ �����ϰ� �̸� �̿��ϴ� ���α׷�.  
 */
package lab5_1;

public class PizzaTest {

	public static void main(String[] args) {
		System.out.println("lab5_1: ȫ�ؼ�\n");
		Pizza p = new Pizza();
		p.brand = "PizzaSchool";
		p.dia = 25.5;
		p.price = 50000;
		
		System.out.print("�귣��� "+p.brand+"�̸� ������ "+p.dia+"cm ������ "+p.price+"���� ��ΰ� ���ִ�����");

	}

}
