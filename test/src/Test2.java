import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("\n");
		sb.append("1\n");
		sb.append("2\n");
		sb.append("3\n");
		System.out.println(sb.toString());
		System.out.print("end");
	}	
}
class Car {
	String name;
	
	public Car(String name) {
		this.name = name;
	}
}