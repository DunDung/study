/*
 * 颇老疙: Score.java
 * 累己老: 2018.6.12
 * 累己磊: 全霖己
 */
package lab15_2;

import java.util.*;


public class Score {

	public static void main(String[] args) {
        System.out.println("lab15_2: 全霖己\n");
		Map<String, Integer> st = new HashMap<String, Integer>();

       st.put("kim", 90);
        st.put("park", 80);
        st.put("lee", 100);
        
       Scanner sc = new Scanner(System.in);
        do {
            System.out.print("捞抚 涝仿: ");
            String name = sc.next();
            if( name.equals("quit") ) break;
            System.out.println("己利 = " + st.get(name)+"\n");
        } while(true);
        System.out.println("\n"+st);
  }
}
