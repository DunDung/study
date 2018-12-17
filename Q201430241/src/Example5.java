import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example5 {

    static String[] convertToArray(String s) {
    	s = s.toLowerCase();
    	List<String> l = new ArrayList<>();
    	String regex = "[a-z]+";
    	Matcher matcher = Pattern.compile(regex).matcher(s);
    	while(matcher.find())
    		l.add(matcher.group(0));
    	return l.toArray(new String[l.size()]);

    }

    public static void main(String[] args) {
        String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
           "1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
        for (String s : a) {
            String[] t = convertToArray(s);
            System.out.println(Arrays.toString(t));
        }
    }
}

