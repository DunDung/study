import java.util.ArrayList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
       List<String> l = new ArrayList<>();
        for(String s : a)
        	if(!l.contains(s))
        		l.add(s);
        
        System.out.println(l);
    }
}
