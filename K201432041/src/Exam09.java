import java.util.Arrays;

public class Exam09 {

    public static String[] insert(String[] a, int index, String s) {
    	String [] n = new String[a.length+1];
    	for(int i=0; i<a.length; i++)
    		n[i]=a[i];
    	
    	for(int i = n.length-1; i>index; i--) 
    		n[i] = n[i-1];
    	n[index] = s;
    	return n;
    }

    public static void main(String[] args) {
        String[] a = {"a", "c", "d", "f", "g", "h"};
        a = insert(a, 1, "b");
        a = insert(a, 4, "e");
        System.out.println(Arrays.toString(a));
    }
}

