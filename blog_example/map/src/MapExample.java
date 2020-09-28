import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapExample {

	public static void main(String[] args) {
		example9();
	}

	public static void example1() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1);
		map.put("포도", 1);
		map.put("사과", 2);

		System.out.println(map);
	}

	public static void example2() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1);
		map.put("포도", 1);

		map.putIfAbsent("딸기", one());
		map.putIfAbsent("포도", 3);

		System.out.println(map);
	}

	public static void example3() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 2);

		Function<String, Integer> function = (key) -> key.length();

		map.computeIfAbsent("파인애플", function);
		map.computeIfAbsent("딸기", function);

		System.out.println(map);
	}


	public static int one() {
		return 1;
	}

	public static void example4() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1);


		map.computeIfPresent("사과", (key, value) -> {
			System.out.println(key + " " + value);
			return map.get(key)+ 1;
		});
		map.computeIfPresent("사과", (key, value) -> map.get(key)+ 1);
		map.computeIfPresent("사과", (key, value) -> map.get(key)+ 1);
		map.computeIfPresent("사과", (key, value) -> map.get(key)+ 1);
		map.computeIfPresent("딸기", (key, value) -> value + 1);

		System.out.println(map);
	}

	public static void example5() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1);

		Integer 딸기 = map.get("딸기") + 1;

		map.compute("사과", (key, value) -> value + 1);

		System.out.println(map);
	}

	public static void example7() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1);

		map.merge("사과", 1, (value, putValue) -> value + 1);
		map.merge("딸기", 1, (value, putValue) -> value + 1);
		map.merge("포도", 1, (value, putValue) -> value + 1);
		map.merge("포도", 1, (value, putValue) -> map.get("수박"));

		System.out.println(map);
	}
	public static void example6(String[] words) {
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.merge(word, 1, (value, putValue) -> value + 1);
		}
	}

	public static void example9() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1);
		map.put("포도", 1);

		int count = map.get("수박");
		System.out.println(count);
	}


}
