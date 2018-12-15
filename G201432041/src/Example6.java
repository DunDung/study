import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Example6 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(5);
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<a.length; i++) {
        	if(!m.containsKey(a[i]))
        		m.put(a[i], 1);
        	else
        		m.replace(a[i], m.get(a[i]), m.get(a[i])+1);
        }
        for(int i=0; i<5; i++)
        	System.out.print(i+"="+m.get(i)+" ");
    }
}

