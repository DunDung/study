/*
 * ���ϸ�: Score.java
 * �ۼ���: 2018.6.12
 * �ۼ���: ȫ�ؼ�
 */
package lab15_2;

import java.util.*;


public class Score {

	public static void main(String[] args) {
        System.out.println("lab15_2: ȫ�ؼ�\n");
		Map<String, Integer> st = new HashMap<String, Integer>();

       st.put("kim", 90);
        st.put("park", 80);
        st.put("lee", 100);
        
       Scanner sc = new Scanner(System.in);
        do {
            System.out.print("�̸� �Է�: ");
            String name = sc.next();
            if( name.equals("quit") ) break;
            System.out.println("���� = " + st.get(name)+"\n");
        } while(true);
        System.out.println("\n"+st);
  }
}
