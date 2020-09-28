package mid2_3;

public class Circle {
	private double radius;  // 반지름
	private Point center;   // 중심 점

	// (2) 반지름은 매개변수로 받아 초기화하고, 중심은
	//       x, y좌표가 0, 0인 점으로 초기화하는 생성자
	public Circle(double radius) {
		this.radius = radius;
		this.center = new Point(0,0);
	}

	// (3) 반지름과 중심을 매개변수로 받아 초기화하는 생성자
	public Circle(double radius, Point center) {
		this.radius = radius;
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public Point getCenter() {
		return center;
	}

	// (4) 현재 원이 매개변수로 받은 원(other)과 중심 점의 
	//    x, y 좌표가 모두 동일한지 여부(true/false)를 리턴하는
	//    메소드
	// -이 메소드에는 출력문 없음
	public boolean sameCenter(Circle other) {
		if(this.center.getX() == other.center.getX() && this.center.getY() == other.center.getY())
			return true;
		else
			return false;
	}
}



