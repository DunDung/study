package lab6_2;

public class Circle {
	private double radius;
	
	public Circle() { //매개변수 없이 반지름을 1.0으로 초기화하는 constructor
		this.radius=1;
	}
	public Circle(double radius) { //반지름을 매개변수로 받아 초기화하는 constructor 
		this.radius = radius;
	}
	
	public void setRadius(double radius) { //반지름 getter/setter
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() { //면적계산 메소드 - 매개변수 없음
		return radius*radius*3.14;
	}
	
}
