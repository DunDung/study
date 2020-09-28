package ±¤¹®Áß;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<>();
		while(true) {
			String s = scan.next();
			if(s.equals("³¡"))
				break;
			if(m.containsKey(s.substring(0, 3)))
				System.out.println(s);
			else
				m.put(s.substring(0, 3), 1);
			
		}
			
	}

}
