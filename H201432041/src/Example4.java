
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

	static String[] convertToArray(String s) {
		// ���ڿ� s���� �ܾ �����Ͽ� �ܾ� ��� �迭�� �����϶�.
		// �ܾ�� ���ĺ���θ� �����Ǿ�� �Ѵ�.
		// ���ϵǴ� �迭�� �ܾ�� ���� �ҹ��ڷ� ��ȯ�Ǿ�� �Ѵ�.
		s= s.toLowerCase().trim();
		String [] a = new String[6] ;
		StringBuilder b = new StringBuilder();
		int c =0;
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equals("[a-z]"))
				b.append(s.substring(i, i+1));
			else
				a[c++] = b.toString();
		}
		return a;

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

