import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam04 {

	public static String[] solution(String s) {
		// 구현하라.
		List <String> list = new ArrayList<>();
		
		String regex ="[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		while (matcher.find()) 
			list.add(matcher.group(0));
		
		return list.toArray(new String[list.size()]);
	}

	public static void main(String[] args) {
		String s = "a1223 (235) 157, 7814; asd_32as";
		String[] a = solution(s);
		System.out.println(Arrays.toString(a));
	}
}

