import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {

	static int solution(List<Integer> list) {
		Map<Integer, Integer> m = new HashMap<>();
		int max = 0;
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(!m.containsKey(list.get(i)))
				m.put(list.get(i), 1);
			else 
				m.replace(list.get(i), m.get(list.get(i)), m.get(list.get(i))+1);
		}
		for(int i=0; i<list.size(); i++) {
			if(max<m.get(list.get(i))) {
					max = m.get(list.get(i));
					result = list.get(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> a =
				Arrays.asList(new Integer[] {1, 7, 1, 8, 5, 2, 2, 3, 5, 3, 1, 3, 7});
		System.out.println(a.toString());
		int maxValue = solution(a);
		System.out.println(maxValue);
	}
}

