import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example5 {

    public static void main(String[] args) {
        String[] a1 = { "d", "a", "b", "a", "c", "a" };
        String[] a2 = { "b", "a", "f", "e", "b", "b" };

        Set<String> s = new HashSet<>();
        s.addAll(Arrays.asList(a1));
        s.removeAll(Arrays.asList(a2));
        System.out.println(s);
        //        List<String> l1 = Arrays.asList(a1);
//        List<String> l2 = Arrays.asList(a2);
//        List<String> z = new ArrayList<>();
//       
//        for(int i=0; i<l1.size(); i++) {
//        	if(!l2.contains(l1.get(i)))
//        		if(!z.contains(l1.get(i)))
//        			z.add(l1.get(i));
//        }
//        System.out.println(z);
//        
    }
}
