package lab7_4;

public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	//자동코드 생성

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
/*	
	@Override
	public String toString() {
		return "반지름이  "+radius+ "인 원";
	}
	
	@Override
	public boolean equals(Object obj) {
	//	Circle other = (Circle)obj;
		return radius == ((Circle)obj).radius;
	}
*/
}
