package blog_example.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
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
			.orElseGet(OptionalInt::empty);
	}

	public static Optional<Integer> findMinMultiple22(List<Integer> numbers, int anyNumber) {
		Collections.sort(numbers);
		for (Integer number : numbers) {
			if (number % anyNumber == 0) {
				return Optional.of(number);
			}
		}
		return Optional.empty();
	}

	public static Optional<Integer> findMinMultiple256(List<Integer> numbers, int anyNumber) {
		return numbers.stream()
			.sorted()
			.filter(number -> number % anyNumber == 0)
			.findFirst();
	}

	public static OptionalInt findMinMultiple0(List<Integer> numbers, int anyNumber) {
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
