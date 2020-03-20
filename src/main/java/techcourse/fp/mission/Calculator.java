package techcourse.fp.mission;

import java.util.List;

public class Calculator {
	public static int sum(List<Integer> numbers, Conditional conditional) {
		return numbers.stream()
			.filter(conditional::test)
			.mapToInt(Integer::intValue)
			.sum();
	}

	// public static int sumAllEven(List<Integer> numbers) {
	// 	int total = 0;
	// 	for (int number : numbers) {
	// 		if (number % 2 == 0) {
	// 			total += number;
	// 		}
	// 	}
	// 	return total;
	// }
	//
	// public static int sumAllOverThree(List<Integer> numbers) {
	// 	int total = 0;
	//
	// 	//TODO: List에 담긴 값 중 3보다 큰 수만을 더해야 한다.
	//
	// 	return total;
	// }
}
