
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Example2 {

    static List<String> solution(String[] a1, String[] a2, String[] a3) {
    	List<String>l1 = Arrays.asList(a1);
    	List<String>l2 = Arrays.asList(a2);
    	List<String>l3 = Arrays.asList(a3);
    	Collection<String> c = new ArrayList<>();
    	c.addAll(l1);
    	c.removeAll(l2);
    	c.addAll(l2);
    	c.removeAll(l3);
    	return (List<String>)c;

    }

    public static void main(String[] args) {
        String[] a1 = { "A", "B", "D", "F", "G" };
        String[] a2 = { "B", "C", "F", "H", "I" };
        String[] a3 = { "B", "F", "G", "H", "I" };

        System.out.println(solution(a1, a2, a3));
    }
}

