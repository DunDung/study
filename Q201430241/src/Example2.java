
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Example2 {

    static List<String> solution(String[] a1, String[] a2, String[] a3) {
    	List<String> s = new ArrayList<>();
    	s.addAll(Arrays.asList(a1));
    	s.addAll(Arrays.asList(a2));
    	s.removeAll(Arrays.asList(a3));
    	return s;
    }
    public static void main(String[] args) {
        String[] a1 = { "A", "B", "D", "F", "G" };
        String[] a2 = { "B", "C", "F", "H", "I" };
        String[] a3 = { "B", "F", "G", "H", "I" };

        System.out.println(solution(a1, a2, a3));
    }
}

