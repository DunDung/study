package ±¤¹®Áß;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StarChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<>();
		while(true) {
			String s = scan.next();
			if(s.length() == 2)
				System.out.println(s.substring(0,1)+"*");
			else
				System.out.println(s.substring(0,1)+"**");
			
		}
			
	}

}
