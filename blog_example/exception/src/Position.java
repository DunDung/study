public class Position {
	public Position(String position) throws InvalidPositionException {
		if (position.length() != 2) {
			throw new InvalidPositionException("형식 오류");
		}
	}
}