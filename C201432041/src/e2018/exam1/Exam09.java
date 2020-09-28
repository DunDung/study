package e2018.exam1;

public class Exam09 {

    static String reverse(String path) {
    	return new StringBuilder(path).reverse().toString();
   }

    public static void main(String[] args) {
        String[] a = { "hello", "world", "hello world" };
        for (String s : a)
            System.out.println(reverse(s));
    }
}
