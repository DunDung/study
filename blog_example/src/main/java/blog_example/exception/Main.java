package blog_example.exception;

public class Main {
	public static void main(String[] args) {
		try {
			Position position = new Position("2");
		} catch (InvalidPositionException e) {
			System.out.println(e.getMessage());
		}
	}
}
