package 예제문제;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Example1 { 
	public static void main(String[] args) throws IOException { 
		String filePath = "c:/shakespeare.txt";       
		Map<String, Integer> m = new HashMap<>();
		Scanner scanner = new Scanner(Paths.get(filePath));   
		scanner.useDelimiter("[^a-zA-Z]+");    
		while (scanner.hasNext()) {   
			String s = scanner.next();
			if(m.containsKey(s))
				m.replace(s, m.get(s), m.get(s)+1);
			else
				m.put(s, 1);
			}
		List<Integer> l = new ArrayList<>();
		System.out.println(l);
		scanner.close();  
		} 
	}
