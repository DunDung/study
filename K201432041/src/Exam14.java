import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam14 {

    public static String[] solution(String[] a1, String[] a2) {
    	List<String> list = new ArrayList<>();
    	for(String s : a1)
    		list.add(s);
    	for(String s : a2)
    		list.add(s);
    	return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] a1 = { "d", "a", "b", "c" };
        String[] a2 = { "B", "D", "C", "A" };
        String[] a3 = solution(a1, a2);
        System.out.println(Arrays.toString(a3));
    }
}

