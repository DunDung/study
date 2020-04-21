import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class MultipleFinder {

	public static Integer findMinMultiple(List<Integer> numbers, int anyNumber) {
		Collections.sort(numbers);
		for (Integer number : numbers) {
			if (number % anyNumber == 0) {
				return number;
			}
		}
		return null;
	}

	public static OptionalInt findMinMultiple2(List<Integer> numbers, int anyNumber) {
		return numbers.stream()
			.sorted()
			.filter(number -> number % anyNumber == 0)
			.findFirst()
			.map(OptionalInt::of)
			.orElse(OptionalInt.empty());
	}

	public static OptionalInt findMinMultiple3(List<Integer> numbers, int anyNumber) {
		Collections.sort(numbers);
		for (Integer number : numbers) {
			if (number % anyNumber == 0) {
				return OptionalInt.of(number);
			}
		}
		return OptionalInt.empty();
	}
}
