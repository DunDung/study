
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Example8 {

    static int solution(List<Integer> a) {
    	int max = 0;
    	int key = 0;
    	Map<Integer, Integer> m = new HashMap<>();
    	for(int i =0; i<a.size(); i++) {
    		if(m.containsKey(a.get(i))) {
    			m.replace(a.get(i), m.get(a.get(i)), m.get(a.get(i))+1);
    			if(max < m.get(a.get(i))) {
    				max = m.get(a.get(i));
    				key =a.get(i);
    			}
    		}
    		else
    			m.put(a.get(i), 1);
    	}
    	return key;
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; ++i)
            a.add(random.nextInt(10) + 1);
        System.out.println(a.toString());
        int maxValue = solution(a);
        System.out.println(maxValue);
    }
}

