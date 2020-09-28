package lab6_2;

public class Circle {
	private double radius;
	
	public Circle() { //�Ű����� ���� �������� 1.0���� �ʱ�ȭ�ϴ� constructor
		this.radius=1;
	}
	public Circle(double radius) { //�������� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor 
		this.radius = radius;
	}
	
	public void setRadius(double radius) { //������ getter/setter
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() { //������� �޼ҵ� - �Ű����� ����
		return radius*radius*3.14;
	}
	
}
